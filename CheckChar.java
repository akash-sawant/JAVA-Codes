import java.util.*;
class Char
{
	private char ch;
	
	public void setChar(char ch)
	{
		this.ch=ch;
	}
	
	public boolean checkChar()
	{
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			return true;
		}
		else if(ch>=48 && ch<=57)
		{
			return false;
		}
		return false;
	}
}

public class CheckChar
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Char ch=new Char();
		System.out.println("ENter the character");
		char inputCh=sc.nextLine().charAt(0);
		ch. setChar(inputCh);
		
		if(ch.checkChar())
		{
			System.out.println("the character is an alphabet");
		}
		else if(inputCh>=48 && inputCh<=57)
		{
			System.out.println("character is a digit");
		}
		else
		{
			 System.out.println("The character is a special symbol.");
		}
	}
}