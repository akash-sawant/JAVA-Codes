 /* Q41)..... Write a program in C to separate odd and even integers in separate arrays ?
Test Data :
Input the number of elements to be stored in the array :5
Input 5 elements in the array :
element - 0 : 25
element - 1 : 47
element - 2 : 42
element - 3 : 56
element - 4 : 32
Expected Output :
The Even elements are :
42 56 32
The Odd elements are :
25 47
*/


import java.util.*;
public class EvenOddNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("Enter values in the array");
		for(int i=0; i<a.length; i++)
 		a[i]=sc.nextInt();
		System.out.println("Display values in the array");
		for(int i=0; i<a.length; i++)
		System.out.printf(a[i]+" ");
			
		System.out.println("\n\nEven numbers");
		for(int i=0; i<a.length; i++)
		{
		 	if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("\nOdd numbers");
		for(int i=0; i<a.length; i++)
			{
				if(a[i]%2!=0)
				{
					System.out.println(a[i]);
				}
			}
	}
	
}
