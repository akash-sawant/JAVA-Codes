import java.util.*;
public class Missing
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter values in the array");
		for(int i=0; i<a.length; i++)
		a[i]=sc.nextInt();
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}    
		}
		System.out.printf("The sorted array is :");
		for(int i=0; i<a.length; i++)
		System.out.println(" "+a[i]);
		System.out.println("\nMissing elements are:");
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=a[i]+1; j<a[i+1]; j++)
			{
				
				System.out.printf(j+" ");
			}
		}
	}
}