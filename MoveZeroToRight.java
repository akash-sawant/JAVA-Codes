 /*
Q55)........
 Write a program in C to move all zeroes to the end of a given array.
Expected Output :
The given array is : 2 5 7 0 4 0 7 -5 8 0
The new array is:
2 5 7 8 4 -5 7 0 0 0
*/



import java.util.*;
public class MoveZeroToRight
{
     public static void main(String x[])
     {
     	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter data in array");
	for(int i=0; i<a.length; i++)
	{
	   a[i]=sc.nextInt();
	}
	System.out.println("Before move zero");
	for(int i=0; i<a.length; i++)
	{
	   System.out.printf("%d\t",a[i]);
	}
	
	int left=0;
	for(int i=0; i<a.length; i++)
	{
           if(a[i]!=0)
	    {
		int temp=a[i];
		a[i]=a[left];	
		a[left]=temp;
		left++;
	    }
	}
	System.out.println("\nafter move zero");
	for(int i=0; i<a.length; i++)
	{
	    System.out.printf("%d\t",a[i]);
	}
     }
}