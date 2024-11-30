import java.util.*;

class Factorial
{
	private int number;
	
	public void setValue(int x)
	{
		this.number=x;
	}
	public int getFactorial()
	{
		int factorial=1;
		for(int i=1; i<=number; i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
}
	
	public class FactorialApp
	{
		public static void main(String m[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int x=sc.nextInt();
			Factorial f=new Factorial();
			f.setValue(x);
			int result=f.getFactorial();
			System.out.println("Factorial of the number is"+result);
		}
	}