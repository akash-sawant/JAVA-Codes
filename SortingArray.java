/*Q3 Write program to create class name as SortArr with two functions
void setArray(int a[]): this function can accept array as parameter
int [] getSortArray(): this function can perform sorting on array and return sorted array*/

import java.util.*;

class Sorting
{
	private int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public int[] getSortArray()
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
public class SortingArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in array");
		int no=sc.nextInt();
		int a[]=new int[no];
		
		System.out.println("Enter the values in the array");
		for(int i=0; i<no; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Sorting s=new Sorting();
		s.setArray(a);
		int[] sortArray=s.getSortArray();
		
		System.out.println("Sorted array is as follows");
		for(int i=0; i<sortArray.length; i++)
		{
			System.out.println(sortArray[i]+" ");
		}
	}
}