import java.util.*;
class Max
{
	int a[];

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

public class FindMaximumNo
{
	public static void main(String x[])
	{
		Max m=new Max();

		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}

		m.setArray(a);
		int max=m.getMax();

		System.out.println("the maximum value is :"+max);
	}
}