import java.util.*;

public class CircularSubarraySumNoFunctions 
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