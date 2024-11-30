import java.util.Scanner;
public class RevNumApp{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		int no,rev=0, rem;
		System.out.println("Enter the number:");
		 no=scn.nextInt();
		
		 while(no!=0){
			 rem=no%10;
			 no=no/10;
			 rev=rev*10+rem;
		 }
		 System.out.printf("Reverse number is %d\n",rev);
	}
}