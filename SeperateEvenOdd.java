import java.util.*;
public class SeperateEvenOdd
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
	  System.out.println("Even numbers :");
	  for(int i=0; i<a.length; i++)
	{
	    if(a[i]%2==0)
		{
		   System.out.println(a[i]+" ");
		}
	}
	 System.out.println("Odd numbers :");
	 for(int i=0; i<a.length; i++)
	{
	   if(a[i]%2!=0)
       	    { 
		System.out.println(a[i]+" ");
	    }
	}
      }
}