/* Q47)........
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
Expected Output :
The given array is : 1 3 4 7 8 9 9 10
The ceiling of 5 is: 7
*/

import java.util.*;
public class Calculate_ceil
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp,ceil=-1,n;
		int a[]=new int[8];
		System.out.println("Enter the values in the array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number");
		n=sc.nextInt();
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
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]>n)
			{
				ceil=a[i];
				break;	
			}
			else if(a[a.length-1]<n)
			{
				ceil=(a[a.length-1]);
				break;
			}
			else if(a[i]==n)
			{
				ceil=a[i];
				break;
			}
			else if(a[i]<n && a[i+1]>n)
			{
				ceil=a[i+1];
				break;
			}
		}
		System.out.println(" ceil of " +n+" is" + ceil);
	}
}