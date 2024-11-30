/*
Q 62).......
Write a program in C to find the minimum distance between two numbers in a given array.
Expected Output:
The given array is:
7 9 5 11 7 4 12 6 2 11
The minimum distance between 7 and 11 is: 1
*/

import java.util.*;
public class MinDiffBetTwoNo
{
	public static void main(String x[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the values in the array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}	
		System.out.println("Enter the no to find distance between two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		int lastIndexNum1 = -1;
        	int lastIndexNum2 = -1;
        	int minDistance = Integer.MAX_VALUE; 

		for (i=0; i<a.length; i++) 
		{
           		 if (a[i]==num1) 
			{
               			 lastIndexNum1 = i; 
                		if (lastIndexNum2 != -1)
				 {
                   			 minDistance = Math.min(minDistance, Math.abs(lastIndexNum1 - lastIndexNum2));
               			 }
           		 }

           		 if (a[i]==num2) 
				{
               				lastIndexNum2 = i; 
                			if (lastIndexNum1 != -1) 
					{
                    				minDistance = Math.min(minDistance, Math.abs(lastIndexNum2 - lastIndexNum1));
                			}
            			}
        		}
        	if (lastIndexNum1 == -1 || lastIndexNum2 == -1) 
			{
           			 System.out.println("One or both numbers not found in the array.");
        		} 
		else 
			{
            			System.out.println("The minimum distance between " + num1 + " and " + num2 + " is: " + minDistance);
        		}
    		
	   
	}
}