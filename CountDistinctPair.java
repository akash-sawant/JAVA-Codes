/*
Q58)......
Write a program in C to count all distinct pairs for a specific difference
Expected Output:
The given array is:
5 2 3 7 6 4 9 8
The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
Number of distinct pairs for difference 5 are: 3
*/


import java.util.*;
public class CountDistinctPair
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("Enter the values in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter specific difference :");
		int SD=sc.nextInt();

		int count=0;
		System.out.println("the distinct difference "+ SD +" are :");
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[j]-a[i]==SD) || (a[i]-a[j]==SD))
				{
					System.out.print("["+a[j]+","+a[i]+"]");
					count++;
				}
			}
		}
		System.out.println("\n Number of distinct pairs for difference"+SD+"are:"+count);
		
	
	}
}