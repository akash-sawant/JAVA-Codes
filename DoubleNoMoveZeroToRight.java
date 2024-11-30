import java.util.Scanner;

public class DoubleNoMoveZeroToRight 
	{
   		 public static void main(String[] args) 
		{
       			 Scanner sc = new Scanner(System.in);
        		 System.out.println("Enter the number of elements in the array:");
        		 int n = sc.nextInt();
        		 int a[] = new int[n];

        		System.out.println("Enter data in array:");
        		for (int i=0; i<a.length; i++) 
			{
            			a[i] = sc.nextInt();
        		}
       			System.out.println("The given array is:");
       			for (int i=0; i<a.length; i++) 
			{
            			System.out.printf("%d ", a[i]);
       			}
			
			//for double value
        		for (int i=0; i<a.length - 1; i++) 
			{
            			if (a[i]==a[i+1] && a[i]!=0)
				 {
                			a[i]=a[i]*2; // Double the value
                			a[i+1] = 0;    // Set next element to 0
            			 }
        		}

        		// Move all non-zero elements to the left
        		int left=0;
       			for (int i=0; i<a.length; i++) 
			{
            			if(a[i] !=0) 
				{
                			int temp = a[i];
                			a[i] = a[left];
                			a[left] = temp;
                			left++;
           			 }
        		}

        		// Display the new array
        		System.out.println("\nThe new array is:");
        		for (int i=0; i<a.length; i++) 
			{
            			System.out.printf("%d ", a[i]);
        		}
    		}
	}
