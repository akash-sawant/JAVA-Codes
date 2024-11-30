/*Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate cube of number and return it.*/


import java.util.*;

class Cube
{
	private int no;
	
	 public void setValue(int no)
	 {
		 this.no=no;
	 }
	 public int getCube()
	 {
		 return no*no*no;
		 
	 }
}

public class CubeCal
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find cube");
		int no=sc.nextInt();
		
		Cube c=new Cube();
		c.setValue(no);
		c.getCube();
		System.out.println("the cube of this number is"+c.getCube());
	}
}