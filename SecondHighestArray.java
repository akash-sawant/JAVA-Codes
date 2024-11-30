import java.util.Scanner;
public class SecondHighestArray{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=scn.nextInt();
		int a[]=new int[size];
		
		
		System.out.prtintln("Enter the Number:");
		for(int i=0;i<a.length;i++){
			a[i]=scn.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\n Sorted array is:");
		for(int i=0;i<a.length-1;i++){
			System.out.println(a[i]+"  ");
			
			
			System.out.println("Second Largest Element is:");
			int count=1;
			for(int i=0;i<a.length-1;i++){
				if(a[i]!==a[i+1]){
					count++;
				}
				if(count==2){
					System.out.println(a[i+1]);
				}
			}
		}
	}
}