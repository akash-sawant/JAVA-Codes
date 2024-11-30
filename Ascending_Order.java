import java.util.*;
public class Ascending_Order
{
	public static void main(String x[])
	{
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the values in the array");
		for(i=0; i<a.length; i++)
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

		System.out.println("Sorted array is :");
		for(i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}