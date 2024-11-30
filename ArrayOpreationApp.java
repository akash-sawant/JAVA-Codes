import java.util.Scanner;//import the packgae
class ArrayOperation{
	int a[];

public ArrayOperation(int a[]){ //   constructor
	this.a=a;
 }
 void calSum(){  // get the function CalSum
	  for(int i=0;i<a.length;i++){
		int rem=0;int temp=0;int Sum=0;
		temp=a[i];
		while(temp!=0){
			rem=temp%10;
			rem=temp/10;
			Sum=Sum+rem;
			System.out.println("Akash");
		}
		a[i]=Sum;
	  }
	  
	}
	int []getSumArray(){
		return a;
  }
  
  public class ArrayOpreationSumApp{ 
	public static void main(String[] args){ // main method
		Scanner scn=new Scanner(System.in); // using the scanner class
		int a[]=new int[5]; // crate the array
		System.out.println("Enter the Array:");
		for(int i=0;i<a.length;i++){
			a[i]=scn.nextInt();
		}
		ArrayOperation ao=new ArrayOperation(a);//create the object
		ao.calSum();
		int result[]=ao.getSumArray();
		System.out.println("Enter the array element each digit");
		for(int j=0;j<result.length;j++){
		System.out.println(""+result[j]);
		}
	}
  }
}