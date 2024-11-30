/*
Q53)......
Write a program in C to find if a given integer x appears more than n/2 times in a sorted array of n integers ?
Expected Output :
The given array is : 1 3 3 5 4 3 2 3 3
The given value is : 3
3 appears more than 4 times in the given array[]
*/


import java.util.*;

public class FindMajorityElement 
	{
   	    public static void main(String[] args)
	 {
       		 Scanner sc = new Scanner(System.in);
		 int a[]= new int[9];
		 System.out.println("Enter input:");
		 for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value to check");
		int x=sc.nextInt();
		System.out.printf("The given array is :");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
        	int count=0;
        	for (int i=0; i<a.length; i++) 
		{
            		if (a[i]==x) 
			{
                		count++;
            		}
        	}

        
        	if (count>a.length/2)
		 {
        	    	System.out.println(x + " appears more than " + a.length/ 2 + " times in the given array.");
     		 } 
		else 
		{
     		       System.out.println(x + " does not appear more than " + a.length/ 2 + " times in the given array.");
       		 }
	    }
} 