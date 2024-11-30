/*create class name as ArrayOperation with function name as setArray() and create its 
Two child classes name as Unique , MergeArray. We need to inherit the ArrayOperation 
class in Unique , MergeArray and create function and write the logic.
1. Unique Class : -
Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
Output : All unique elements in the array are: 3, 20, 12, 10 
 
2. MergeArray class :-
Input -First Array :- 1 2 3 4 5
 Second Array :- 6 7 8 9 10 
Output - 1 10 2 9 3 8 4 7 5 6*/


import java.util.Scanner;
class ArrayOperation{
	int a[];
	
	public  void setArray(int a[]){
		this.a=a;
	}
	
 class Unique  extends ArrayOperation{
	 public void FindUnique(){
	for(int i=0;i<a.length;i++){
		boolean flag=true;
		for(int j=0;j<a.length;j++){
			if(i!=j && a[i]==[j] ){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(a[i]+" ");
		}
	}
 }
 }
class MergeArray extends ArrayOperation{
	public void FindMergedArry(){
	int c[]=new int[a.length+b.length];
		int index=0;
		int value;
		for(int i=0;i<index;i++){
			c[index++]=a[i];
			c[index++]=b[b.length-1];
		}
		System.out.println("After merged array is:");
		for(int i=0;i<value;i++){
			System.out.println(value+"  ");
		}
		System.out.println();
	}
}
 public class UniqueArrayMergedApp{
		public static void main(String[]args){
			Scanner scn=new Scanner(System.in);
			Unique u=new Unique();
			
			System.out.println("Enter the size of element is:");
			int size=scn.nextInt();
			int[] reuslt=new int[size];
			
			System.out.println("enter the Elmenet is:");
			for(int i=0;i<size;i++){
				reuslt[i]=scn.nextInt();
			}
			u.setArray();
			u.FindUnique(result);
			
			
		}
		
		MergeArray ma=new MergeArray();
		System.out.println("Enter the size of first Array:");
		int size1=scn.nextInt();
		int []result1=new int[size1];
		System.out.println("Enter the Elmenet:");
		for(int i=0;i<size1;i++){
			result1=scn.nextInt();
		}
		System.out.println("Enter the size of Second Array:");
		int size2=scn.nextInt();
		int []result2=new int[size1];
		System.out.println("Enter the Elmenet:");
		for(int i=0;i<size2;i++){
			result2=scn.nextInt();
		}
		ma.setArray();
		ma.FindMergedArry(result1,result2);
		
	
}