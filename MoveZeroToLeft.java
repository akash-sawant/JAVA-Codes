import java.util.*;
public class MoveZeroToLeft
{
     public static void main(String x[])
     {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the values in array");
	for(int i=0; i<a.length; i++)
	{
	   a[i]=sc.nextInt();
	}
	System.out.println("Before move zeros");
	for(int i=0; i<a.length; i++)
	{
	     System.out.printf("%d\t",a[i]);
	}
	int left=0;
	for(int i=0; i<a.length; i++)
	{
	    if(a[i]==0)
	   {
		int temp=a[i];
		a[i]=a[left];
		a[left]=temp;
		left++;
	   }
	}
	System.out.println("\nAfter move zero");
	for(int i=0; i<a.length; i++)
	{
	    System.out.printf("%d\t",a[i]);
	}
     }

}