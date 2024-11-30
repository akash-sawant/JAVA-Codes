import java.util.Scanner;
public class Test{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=scn.nextInt();
		
		System.out.println("Output is:");
		for(int i=1;i<=n;i++){
			System.out.println(i*i+"  ");
		}
		
	}
}