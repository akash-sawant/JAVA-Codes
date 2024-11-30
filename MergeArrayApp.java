/* Q40)......  Write a program in C to merge two arrays of same size sorted in decending order.
Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Expected Output :
The merged array in decending order is :
3 3 2 2 1 1
*/


import java.util.Scanner;

public class MergeArrayApp
	 {  
   	       public static void main(String x[]) 
		{  
        	     int a[] = new int[5];
       	             int b[] = new int[5];
                     Scanner xyz = new Scanner(System.in);
                     System.out.println("Enter values in the first array:");
                     for (int i = 0; i < a.length; i++) 
			{
                           a[i] = xyz.nextInt();
      		        }

        	System.out.println("Enter values in the second array:");
        	for (int i = 0; i < b.length; i++) 
			{
          	 		 b[i] = xyz.nextInt();
       			 }

       		 int result[] = mergeAndSortDescending(a, b);
       		 System.out.println("Display array after merging and sorting in descending order:");
       		 for (int i = 0; i < result.length; i++) 
			{
            	           System.out.printf("%d\t", result[i]);
        		}
    }

    public static int[] mergeAndSortDescending(int[] m, int[] n) {
        int t = 0;
        int k[] = new int[m.length + n.length];

        // Merging both arrays into one
        for (int i=0; i<m.length; i++, t++) 
	{
            k[t] = m[i];
        }
        for (int j = 0; j < n.length; j++, t++) 
	{
            k[t] = n[j];
        }

        // Sorting the merged array in descending order
        int temp;
        for (int i = 0; i < k.length; i++) 
	{
            for (int j = i + 1; j < k.length; j++) 
		{
            	    if (k[i] < k[j]) 
			{
                   	  temp = k[i];
                   	  k[i] = k[j];
                          k[j] = temp;
                }
            }
        }

        return k; // Returning the merged and sorted array
    }
}
