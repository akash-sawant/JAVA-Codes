/*
Q61)........
Write a program in C to find a pair with the given difference
Expected Output:
The given array is:
1 15 39 75 92
The given difference is: 53
The pair are: (39, 92)
*/

import java.util.*;

public class FindPairWithDifference 
	{
    		public static void main(String[] args) 
		{
        		Scanner sc = new Scanner(System.in);
        		System.out.println("Enter the size of the array:");
        		int n = sc.nextInt();
        		int a[] = new int[n];
        		System.out.println("Enter the elements of the array:");
        		for (int i=0; i<n; i++) 
			{
           			 a[i] = sc.nextInt();
        		}
       			System.out.println("Enter the given difference:");
        		int targetDifference = sc.nextInt();

        		boolean flag = false;
        		for (int i=0; i<a.length; i++) 
			{
           			 for (int j=i+1; j<a.length; j++) 
				{
                			if (Math.abs(a[i]-a[j]) == targetDifference) 
					{
                    				System.out.println("The pair is: (" + a[i] + ", " + a[j] + ")");
                    				flag = true;
                			}
            			}
       			 }

        		if (!flag) 
			{
           			 System.out.println("No pair found with the given difference.");
        		}
    		}
	}
