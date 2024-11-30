import java.util.Scanner;
public class WithoutSortSecMax{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=scn.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the Number:");
		for(int i=0;i<a.length;i++){
			a[i]=scn.nextInt();
		}
		int max=0;
		int smax=a[0];
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				smax=max;
				max=a[i];
			}
			else if(smax<smax && max!=a[i]){
				  smax=a[i];
			}
		}
		
		System.out.println("Second Max is:"+smax);

		
		}
	}
