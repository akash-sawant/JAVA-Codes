/*Q2 Write program to create class name as FindMax with two functions
void setArray(int a[]): this function is used for accept array as parameter
int getMax(): this function can find the max value from array and return it.*/

import java.util.*;

class FindMax
{
	private int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public int getMax()
	{
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}

public class MaximumNo	
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in array");
		int no=sc.nextInt();
		int a[]=new int[no];
		System.out.println("Enter the elements in array");
		for(int i=0; i<no; i++)
		{
			a[i]=sc.nextInt();
		}
		
		FindMax find=new FindMax();
		find.setArray(a);
		int max=find.getMax();
		System.out.println("maximum value is :"+max);
	}
}