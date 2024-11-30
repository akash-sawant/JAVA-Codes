import java.util.Scanner;
public class MissingElement{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=scn.nextInt();
		int a[]=new int[size];
		
		
		System.out.println("Enter the Number:");
		for(int i=0;i<a.length;i++){
			a[i]=scn.nextInt();
		}
			System.out.println("Missing Element is:");
			for(int i=0;i<a.length-1;i++){
				for(int j=a[i]+1;j<a[i+1];j++){
					System.out.printf("%d",j); 
				}
			}
		}
	}
	
	
