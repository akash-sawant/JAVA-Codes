import java.util.*;
class Sorting
{
	int a[];
	
	public void setArray(int a[])
	{
		this.a=Arrays.copyOf(a, a.length);
	}
	public int[] getSortedArray()
	{
		for(int i=0; i<a.length-1; i++)
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
		return a;
	}
}

public class SortArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter values in the array");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		Sorting s=new Sorting();
		s.setArray(a);
		int[]  SortedArray=s.getSortedArray();
		System.out.println("Sorted array is as folloes");
		for(int i:SortedArray)
		{
			System.out.println(i+" ");
		}
	}
}

