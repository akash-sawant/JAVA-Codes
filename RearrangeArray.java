/*
Q63)......
Write a program in C to rearrange positive and negative numbers alternatively in a given array ?
Output:
If positive numbers are more they appear at the end and for also negative numbers, they too appear in the end of the array.
Expected Output:
The given array is:
-4 8 -5 -6 5 -9 7 1 -21 -11 19
The rearranged array is:
-4 7 -5 1 -21 5 -11 8 -9 19 -6
*/

import java.util.*;
public class RearrangeArray
	{
    		public static void main(String x[]) 
		{
      			Scanner sc=new Scanner(System.in);
        		System.out.println("Enter the number of elements in the array: ");
       			int n = sc.nextInt();
        		int a[]= new int[n];
      			System.out.println("Enter the elements of the array (positive and negative numbers):");
        		for (int i=0; i<n; i++) 
			{
            			a[i] = sc.nextInt();
        		}
        
        	System.out.println("The given array is:");
        	for(int i=0; i<a.length; i++)
		System.out.println(a[i]+" ");

        	int pos[]=new int[n];
        	int neg[]=new int[n];
        	int posIndex=0, negIndex=0;
        
        	for (int i=0; i<n; i++) 
		{
            		if (a[i]>=0) 
			{
                		pos[posIndex++] = a[i];
           		 } 
			else
			 {
               			 neg[negIndex++] = a[i];
            		 }
        	}
        
       		int i=0, p=0, nIndex=0;
        	while(p<posIndex && nIndex < negIndex) 
		{
            		a[i++] = neg[nIndex++];
            		a[i++] = pos[p++];
        	}
        
        	while (p < posIndex) 
		{
            		a[i++] = pos[p++];
        	}
        
       		 while (nIndex < negIndex)
		 {
            		a[i++] = neg[nIndex++];
        	 }

        	System.out.println("The rearranged array is:");
        	printArray(a);
    		}
   
   		 public static void printArray(int[] arr) 
		{
        		System.out.print("[");
        		for (int i=0; i<arr.length; i++) 
			{
            			System.out.print(arr[i]);
            			if (i<arr.length - 1) 
				{
            				System.out.print(", ");
            			}
       			 }
       				 System.out.println("]");
   		 }
	}
