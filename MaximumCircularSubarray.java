/*
Q54)
Write a program in C to find the maximum circular subarray sum of a given array.
Expected Output :
The given array is : 10 8 -20 5 -3 -5 10 -13 11
The maximum circular sum in the above array is: 29
*/
import java.util.*;

public class MaximumCircularSubarray 
	{
    		public static void main(String[] args) 
		{
        		Scanner sc = new Scanner(System.in);	
       			System.out.println("Enter the size of the array:");
        		int n = sc.nextInt();
        		int a[]= new int[n];

        		System.out.println("Enter " + n + " elements:");
        		for (int i=0; i<n; i++) 
			{
            			a[i] = sc.nextInt();
       			 }

  
        		int maxSum = a[0], currentSum = a[0];
        		for (int i=1; i<n; i++) 
			{
            			currentSum = Math.max(a[i], currentSum + a[i]);
            			maxSum = Math.max(maxSum, currentSum);
        		}

       
       			 int totalSum = 0;
        		 for (int i=0; i<n; i++) 
			{
           			 totalSum += a[i];
        		}

        
        			currentSum = -a[0];
       			        int minSum = currentSum;
        			for (int i=1; i<n; i++) 
			{
            			a[i] = -a[i];  
            			currentSum = Math.max(a[i], currentSum + a[i]);
            			minSum = Math.max(minSum, currentSum);
        		}

        		int maxCircularSum = totalSum + minSum;
        		int result = (maxCircularSum==0) ? maxSum : Math.max(maxSum, maxCircularSum);
        		System.out.println("Maximum circular subarray sum is: " + result);
    }
} 