import java.util.Scanner;
public class StrongNumberApp{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Nth Number:");
		int n=scn.nextInt();
		
		System.out.println("Strong number is 1 to :"+n+"is:");
		
		for(int num=1;num<=n;num++){
			int sum=0;
			int org=num;
			
			while(num!=0){
				int digit=num%10;
				int fact=1
				
				
				for(int i=1;i<=digit;i++){
					fact*=i;
				}
				sum=sum+fact;
				num/=10;
			}
			if(sum==org){
				System.out.println(org+"  ");
			}
			num=org;
		}
	}
}