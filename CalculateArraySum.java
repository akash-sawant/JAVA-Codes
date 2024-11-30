import java.util.*;
class Sum
{
	int m[];
	
	void setValue(int a[])
	{
		m=a;
	}
	
	void showSum()
	{
		int sum=0; 
		for(int i=0; i<m.length; i++)
		{
			sum=sum+m[i];
		}
		System.out.printf("Sum of all values is %d\n",sum);
	}
}

public class CalculateArraySum
{
	public static void main(String x[])
	{
		Sum sm=new Sum();
	
		Scannner sc=new Scanner(Systen.in);
		int a[]=new int[5];
		System.out.println("Enter the values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		sm.setValue();
		sm.showSum();
	}
}