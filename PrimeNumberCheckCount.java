import java.util.Scanner;
public class PrimeNumberCheckCount{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no=scn.nextInt();
		
		int i=1,count=0;
		while(i<=no){
			if(no%i==0){
				count++;
			}
			i++;
		}
		if(count=2){
			System.out.println("The Number is the Prime number:");
		}else{
			System.out.println("The Number is Not Prime Number:");
		}
	}
}