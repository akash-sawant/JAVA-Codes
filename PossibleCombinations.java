/*
Q 60)....
Write a program in C to print all possible combinations of r elements in a given array
Expected Output:
The given array is:
1 5 4 6 8 The combination from by the number of elements are: 4
The combinations are:
1 5 4 6
1 5 4 8
1 5 6 8
1 4 6 8
5 4 6 8
*/

import java.util.*;
public class PossibleCombinations
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter 5 elements in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int n=a.length;
		System.out.println("The combination from by the number of elements are: ");
		int r=sc.nextInt();
		System.out.println("Possible combinations are");

		generateCombinations(a,new int[r], 0, 0, r);
	}
		public static void generateCombinations(int a[], int data[], int start, int index, int r)
	{
		if(index==r)
		{
			for(int j=0; j<r; j++)
			{
				System.out.print(data[j]+" ");	
			}
				System.out.println();
				return;
		}
		for(int i=start; i<a.length; i++)
		{
			data[index]=a[i];
			generateCombinations(a, data, i+1, index+1, r);
		}
	}
}
