/*
Q 46).......
Write a program in C to rotate an array by N positions ?
Expected Output :
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27
Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9
*/

import java.util.*;
public class RotateArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[11];
		System.out.println("Enter the values in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("ENter the value of index that we want to rotate");
		int n,j,last,first;
		n=sc.nextInt();
		
		//for left rotate
		for(int i=0; i<n; i++)
		{
			first=a[0];
			for(j=0; j<a.length-1; j++)
			{
				a[j]=a[j+1];
			}
			a[j]=first;
	
  		}
		/* for(int i=0; i<n; i++)
		{
			last=a[a.length-1];
			for(j=a.length-1; j>0; j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}*/
		System.out.println("success");
		System.out.println("array after rotating :");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}