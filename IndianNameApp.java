import java.util.Scanner;
class StringApp{
	
	StringApp(char ch[],char skey){
		boolean flag=false;
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]==skey){
				System.out.println(ch[i-1]);
				System.out.println(ch[i+1]);
			}
		}
	}
}
public class IndianNameApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size= scn.nextInt(); 
		char ch[]=new char[size];
        System.out.println("Enter the input: ");
		for(int i=0;i<ch.length;i++){
			ch[i]= scn.next().charAt(0); 
		}
		System.out.println("Enter the search key: ");
		char skey=scn.next().charAt(0);
		
		StringApp sa=new StringApp(ch,skey);
    }
}