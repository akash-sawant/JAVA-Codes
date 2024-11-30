import java.util.*;
class CubeApp
{
	private int no;
	
	public void setNo(int no)
	{
		this.no=no;
	}
	public int getCubeApp()
	{
		return no*no*no;
	}
}

public class Cube
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		CubeApp c=new CubeApp();
		System.out.println("Enter the number");
		int no=sc.nextInt();
		c.setNo(no);
		int result=c.getCubeApp();
		System.out.println("Cube of the number is :" +result);
	}
}