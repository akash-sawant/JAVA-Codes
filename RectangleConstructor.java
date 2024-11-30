import java.util.*;

class Rectangle
{
	private int length;
	private int  breadth;
	
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
	
	public Rectangle(int side)
	{
		this.length=side;
		this.breadth=side;
	}
	public int CalculateArea()
	{
		return length*breadth;
	}
}

public class RectangleConstructor
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		Rectangle r1=new Rectangle();
		System.out.println("Area of rectangle with no parameter"+r1.CalculateArea());
		
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