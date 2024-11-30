/*
Q59).....Write a program in C to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
Expected Output:
The given array is:
2 3 3 5 3 4 1 7 7 7 7
The maximum repeating number is: 7
*/

import java.util.*;
public class MaximumRepetating
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the input");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=n;
		int freq[]=new int[k];
		for(int i=0; i<n; i++)
		{	
			freq[a[i]]++;
		}
		int maxCount=0;
		int maxRepeatElem= -1;
		for(int i=0; i<k; i++)
		{
			if(freq[i] > maxCount)
			{
				maxCount=freq[i];
				maxRepeatElem=i;
			}
		}
		System.out.println("Maximum repeating number is:"+maxRepeatElem);
	}
} 