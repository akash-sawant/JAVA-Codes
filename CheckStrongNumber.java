import java.util.Scanner;
public class CheckStrongNumber{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Strong number :");
		int num=scn.nextInt();
		
		int sum=0;
		int org=num;
		int temp=num;
		
		while(temp!=0){
			int digit=temp%10;
			int fact=1;
			
			for(int i=1;i<=digit;i++){
				fact*=i;
			}
			sum=sum+fact;
			temp/=10;
		}
		if(sum==org){
			System.out.println("This is Strong number :");
		}
		else{
			System.out.println("This not Strong number:");
		}
	}
}