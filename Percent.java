/*Q1. WAP to create class name as Per with method void
setMarks(int marks[]) and we have two child class name
as Nine and Ten with method void showNinePer() this method
can display the ninth class percentage and void showTenPer()
this method can display the tenth class percentage and every
class has six subjects but your task is you have to override
setMarks(int marks[]) in Ten class and calculate percentage by
using best five rules and display it.*/

class Per
{
	private int marks[]
	{
		void setMarks(int marks[])
		{
			this.marks=marks;
		}
	}	
}
class Nine extends Per
{
	void showNinePer()
	{
		int per=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("precentage of six subject is"+(sum)/a.length);
	}
}
class Ten extends Per
{
	void showTenPer()
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Percentage of best five subject is"+(sum)/a.length-1)
		
	}
}

public class Percent
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Nine n=new Nine();
		n.showNinePer();
		
		Ten t=new Ten();
		t.showTenPer();		
	}
}