import java.util.Scanner;
public class MissingElment{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=scn.nextInt();
		int a[]=new int[size];
		
		
		System.out.println("Enter the Number:");
		for(int i=0;i<a.length;i++){
			a[i]=scn.nextInt();
		}
		
		 for(int i=0;i<a.length;i++){
			 for(int j=a[i];j<a[i+1];j++){
				 System.out.println(j+"  ");
			 }
		 }
		
	}
}	