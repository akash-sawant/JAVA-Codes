import java.util.Scanner;
class StringApp{
	StringApp(char ch[],char skey[]){
		boolean flag false;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==skey){
				System.out.println(ch[i-1]);
				System.out.println(ch[i+1]);
			}
		}
	}
}
public class StringAppIndianName{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Size:");
		int size=scn.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter the Input:");
		for(int i=0;i<ch.length;i++){
			ch[i]=scn.nextLine().charAt(0);
		}
		System.out.println("Enter the Serch Value:");
		char skey=scn.nextLine().charAt(0);
		
		StringApp sa=new StringApp(ch,skey);
	}
}