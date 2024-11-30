/*
Q 57).......
  Write a program in C to find out the maximum difference between any two elements such that larger element appears after the smaller number.
Expected Output :
The given array is : 7 9 5 6 13 2
The elements which provide maximum difference is: 5, 13
The Maximum difference between two elements in the array is: 8
*/


import java.util.*;
public class MaxDifference 
	{

    		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
        		int a[] = new int[6];
       			System.out.println("Enter the elements in the array");
		        for(int i=0; i<a.length; i++) 
			{
				a[i]=sc.nextInt();
           		}
        		int maxDiff = a[1] - a[0];
        		int minElement = a[0];
        		int minElem = a[0], maxElem = a[1];

       
        		for (int i=1; i<a.length; i++) 
			{
            			if (a[i] - minElement > maxDiff) 
				{
                			maxDiff = a[i]-minElement;
                			minElem = minElement;
                			maxElem = a[i];
            			}
            
            			if (a[i] < minElement) 
				{
                			minElement = a[i]; // Update the minimum element
            			}
        		}

       	
        	System.out.println("The elements which provide maximum difference are: " + minElem + ", " + maxElem);
        	System.out.println("The Maximum difference between two elements in the array is: " + maxDiff);
    }
} 