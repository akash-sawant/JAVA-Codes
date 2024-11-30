/*
Q 49)..........Write a program in java/c to find the smallest missing element from a sorted array?
Expected Output :
The given array is : 0 1 3 4 5 6 7 9
The missing smallest element is: 2
*/


import java.util.*;

public class SmallestMissing 
	{
   		 public static void main(String[] args) {
     	         Scanner sc= new Scanner(System.in);
      	         int miss=0,i,j,temp;
                 int a[]=new int[5];
                 System.out.println("enter the array");
        
        	for ( i = 0; i < a.length; i++)
		 {
                	a[i]=sc.nextInt();
        	 }
		 for(i=0; i<a.length; i++)
       		 {
          		for(j=i+1; j<a.length; j++)
	     		{
				if(a[i]>a[j])
				{
		   			temp=a[i];
                   			a[i]=a[j];
		   			a[j]=temp;  
				}
	     		}
        	}
		System.out.println("Sorted array is ");
		for(i=0; i<a.length; i++)
		System.out.printf(a[i]+" ");
        
		System.out.println("\nsmallest missing number is");
        	for (i = 0; i < a.length;) 
		{
            		for (j = a[i]+1; j < a[i+1];) 
			{
                		miss=j;
                		break;
            		}
            			break;
        	}
       			 System.out.printf("%d",miss);
         }
}