/* Q42)......Write a program in C to delete an element at desired position from an array. 
Test Data :
Input the size of array : 5
Input 5 elements in the array in ascending order:
element - 0 : 1
element - 1 : 2
element - 2 : 3
element - 3 : 4
element - 4 : 5
Input the position where to delete: 3
Expected Output :
The new list is : 1 2 4 5
*/


import java.util.*;
public class DeleteDesiredPosition
{
     public static void main(String x[])
      {
	   Scanner sc=new Scanner(System.in);
	   int a[]=new int[5];
	   System.out.println("Enter the values in the array");
	   for(int i=0; i<a.length; i++)
	 {
	     a[i]=sc.nextInt();
	 }
	    System.out.println("Enter position to remove element");
	    int Del_element=sc.nextInt();
	    for(int i=0; i<a.length; i++)
	     {
  		if(i==Del_element)
		{
		   for(int j=i; j<a.length-1; j++)
		     {
			a[j]=a[j+1];
		     }	
		}
 	     }
		System.out.println("After position delete");
		for(int i=0; i<a.length-1; i++)
		{
		    System.out.println(a[i]+" ");
		}
       }
}
