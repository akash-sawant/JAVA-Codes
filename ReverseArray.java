import java.util.Scanner;
public class ReverseArray{
	public static void main(String[]args){
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the size of array:");
			int size=scn.nextInt();
			int a[]=new int[size];
			
			System.out.println("Enter the Element:");
			for(int i=0;i<a.length;i++){
				a[i]=scn.nextInt();
			}
		   for(int i=0;i<a.length;i++){
			   int left=0;
			   int right=a.length-1;
			   
			     while(left<right){
				   int temp=a[left];
				   a[left]=a[right];
				   a[right]=temp;
				   left++;
				   right--;
			   }
		   }
		   System.out.println("Reverse Array is:");
		   for(int i=0;i<a.length;i++){
			   System.out.println(a[i]+"  ");
		   }
	}
}