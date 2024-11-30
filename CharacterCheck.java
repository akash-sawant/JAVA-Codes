/*Q5 Write program to create class name as CheckChar with two functions
void setChar(char ch): this function accept single character as input
boolean checkChar(): this function can check character is alphabet or digit of special symbol if
character is alphabet or digit return true if character is digit then return false.*/

import java.util.*;

class CheckChar
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
	public boolean isSpecialSymbol() 
		{
        return !(checkChar() || (ch >= '0' && ch <= '9'));
		}
}

public class CharacterCheck {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char inputChar = sc.nextLine().charAt(0);

        CheckChar checkChar = new CheckChar();
        checkChar.setChar(inputChar);

        if (checkChar.checkChar()) {
            System.out.println("The character is an alphabet.");
        } else if (inputChar >= '0' && inputChar <= '9') {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special symbol.");
        }
    }
}