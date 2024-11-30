/* Q 51)......
Write a program in C to find two elements whose sum is closest to zero
Expected Output :
The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
The Pair of elements whose sum is minimum are:
[44, -46]
*/

import java.util.*;
public class ClosestSumToZero 
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	System.out.print("Enter input: ");
	for(int i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	int minSum = 999999;         // Start with a large number
	int firstelement = 0;
	int secondelement = 0;

	for(int i=0;i<a.length;i++)
	{
	   for(int j=i+1;j<a.length;j++)         // Avoid summing the same elements
	   {
		int sum=a[i]+a[j];

		int absSum= sum<0? -sum: sum;             // If sum is negative, multiply by -1
	                                            //If sum = -10, then absSum = -(-10) = 10
	
		if(absSum<minSum)              // Compare to find the minimum sum closest to zero
		{
		   minSum=absSum;
		   firstelement=a[i];
		   secondelement=a[j];
		}
	   }
	}
	System.out.print("The given array is: ");
	for(int i=0;i<a.length;i++)
	{
	   System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("The pair of element whose sum is minimum are: [" + firstelement + "," + secondelement + "]");
   }
}