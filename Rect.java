/*Create a class named 'Rectangle' with two data members- length and breadth and a
method to calculate the area which is 'length*breadth'. The class has three constructors
which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print
their areas.*/


import java.util.*;
class Rectangle
{
	private int length;
	private int breadth;
	
	public Rectangle()
	{
		this.length=0;
		this.breadth=0;
	}
	
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public int Rectangle(int side)
	{
		this.length=side;
		this.breadth=side;
	}
	
	public int calculateArea()
	{
		return length*breadth;
	}
}

public class Rect
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Rectangle r1=new Rectangle();
		System.out.println("Area of Rectangle with no parameter"+r1.calculateArea());
		
		System.out.println("Enter side for square");
		int side=sc.nextInt();
		Rectangle r2=new Rectangle(side);
		System.out.println("Area of rectangle with one parameter :"+r2.CalculateArea());
		
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		int breadth=sc.nextInt();
		Rectangle r3=new Rectangle(length,breadth);
		System.out.println("Area of rectangle with two parameters :"+r3.CalculateArea());
	}
}
