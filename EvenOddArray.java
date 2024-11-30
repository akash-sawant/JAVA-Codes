import java.util.*;
public class EvenOddArray
{
    public static void main(String x[])
	{
	    int i;
	    Scanner sc=new Scanner(System.in);
	    int a[]=new int[5];
	    System.out.println("Enter the elements in the array");
	    for(i=0; i<a.length; i++)
		{
		   a[i]=sc.nextInt();
		}
	    System.out.println("Even numbers");
	    for(i=0; i<a.length; i++)
		{
		     if(a[i]%2==0)
			{
				System.out.printf(a[i]+" ");
			}
		}
	    System.out.println("\nOdd number");
	    for(i=0; i<a.length; i++)
		{
		     if(a[i]%2!=0)
			{
				System.out.printf(a[i]+" ");
			}
		}
	}
}