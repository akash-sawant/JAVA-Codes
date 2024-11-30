/*
Q 52).....Write a program in C to find a subarray with given sum from the given array?
Expected Output :
The given array is : 3 4 -7 1 3 3 1 -4
[0..1] -- { 3 4 }
[0..5] -- { 3 4 -7 1 3 3 }
[3..5] -- { 1 3 3 }
[4..6] -- { 3 3 1 }
*/



import java.util.*;

public class SubarrayWithGivenSum 
	{
    		public static void main(String x[]) 
		{
        		Scanner sc = new Scanner(System.in);
        		int a[] = new int[8];
        		System.out.println("Enter input: ");
        
		        for (int i=0; i<a.length; i++) 
			{
            			a[i] = sc.nextInt();
        		}
        
       			 int targetSum = 7; 
        		System.out.println("The given array is: ");
        		for(int i=0; i<a.length; i++)
			{
          			  System.out.println(a[i]+ " ");
       			 }
      				 
        		for (int i=0; i<a.length; i++) 
		{
            		int currentSum = 0;
                        for (int j=i; j<a.length; j++) 
			{
                		currentSum += a[j];
                
                		if (currentSum == targetSum) 
				{
                    			System.out.print("[" + i + ".." + j + "] -- { ");
                   			for (int k=i; k<=j; k++) {
                        		System.out.print(a[k] + (k == j ? " " : " "));
                    		}
                    System.out.println("}");
                }
            }
        }
    }
}

