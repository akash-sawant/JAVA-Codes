/*Q2. WAP to create class name as TestChar with 
Method void setCharArray(char []) this method can accept character array as parameter and we have two classes name as 
ToUpperCase with two methods void convertToUpper() this method convert your character array as upper and we have
 one method void show() display the character array after conversion and we have one more class name as RevWord with one methods 
Void revWord(): this method can accept character and reverse the word and display it 
*/

import java.util.Scanner;
class TestChar{
	char ch[];
	
	void setCharArray(char []){
		this.ch=ch;
	}
	char[] getCharArray(){
		return ch;
	}
	
}
class ToUpperCase extends TestChar{
	void convertToUpper(){
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='a' && ch[i]<='z'){
				 ch[i]=ch[i]-32;
			}
		}
	}
}
class RevWord extends TestChar{
	void revWord(){
		System.out.println("Reversed array is:");
		for(int i=0;i<ch.length-1;i>=0;i--){
			System.out.println(ch[i]);
		}
		System.out.println();
	}
}
public class CharUppRevApp{
	public static void main(String[]arg){
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Words:");
		String result =scn.nextLine();
		char[] charArray= result.CharArray();
		
		TestChar tc =new TestChar();
		tc.setCharArray(charArray);
		
		ToUpperCase tc. new ToUpperCase();
		tc.setCharArray(tc.getCharArray());
		tc.convertToUpper();
		tc.show();
		
		RevWord rw=new RevWord();
		rw.setCharArray(tc.getCharArray());
		rw.revWord();
	}
}