/* Q2. Write program to create class name as Factorial with two functions
void setValue(int x): this function accept number as parameter
int getFactorial(): this function can calculate factorial of number and return it*/

import java.util.*;

class Factorial
{
	private int no;
	public void setValue(int no)
	{
		this.no=no;
	}
	public int getFactorial()
	{
		int f=1;
		for(int i=1; i<=no; i++)
		{
			f=f*i;
		}
		return f;
	}
}

public class FactApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		Factorial fact=new Factorial();
		fact.setValue(no);
		fact.getFactorial();
		System.out.println("The factorial of this number is :"+fact.getFactorial());
		
	}
}