
/*
	Q1. WAP to Create class name as ArrayParent with method 
void setArray(int a[]): this method is used for accept the array as parameter or accept integer array as parameter 
We have two child classes name as 
SubArray with method void setIndexes(int start,int end) you have to travel the array between two index and create sub new sub array and we have one method name as int [] getSubArray() 
This method can return sub array which is between two index which we pass in setIndexes() methods 
We have one more class name as FindSumSubArray with two methods 
void setValue(int value): this method can accept one integer parameter and we have one method name as void findSubArrayWithSum()
This method help us the sub array whose element sum is equal with value pass in setValue() function  and one method name as int [] getSubArray() this  method can return values of sub array which is equal with value pass in setvalue() and if sum is not equal with value pass in setValue() then return null
 
*/
import java.util.*;
class ArrayParent{
	int []a;
	void setArray(int []a){
		this.a=a;
	}
}
class SubArray extends ArrayParent{
	int s;
	int e;
	void setIndexes(int start,int end){
		s=start;
		e=end;
	}
	
	int[] getSubArray() {
        if (s >= 0 && e < a.length) {
            int length = e - s + 1;
            int[] newarr = new int[length];
            int j = 0;
            for (int i = s; i <= e; i++) {
                newarr[j++] = a[i];
            }
            return newarr;
        } else {
            System.out.println("Invalid index range");
            return null;
        }
    }
}
class FindSumSubArray extends ArrayParent{
	int value;
	int array[];
	void setValue(int value){
		this.value=value;
	}
	void findSubArrayWithSum(){
		System.out.println("Sub Array with sum " + value + " is: ");
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			int sum=a[i];
			for(int j=i+1;j<a.length;j++){
				sum += a[j];
				if(value == sum){
					flag = true;
					for(int k=i;k<=j;k++){
						System.out.print(a[k]+" ");
					}
					
				}
			}
		}
		if(!flag){
			System.out.println("No subarray with the given sum was found.");
		}
	}
	
}
public class SubArrayInhiApp{
	public static void main(String args[]){
		Scanner  sc=new Scanner(System.in);
		int []arr=new int[5];
		System.out.println("Enter 5 elements in array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Start: ");
		int s=sc.nextInt();
		System.out.println("Enter End: ");
		int e=sc.nextInt();
		SubArray sa=new SubArray();
		sa.setArray(arr);
		sa.setIndexes(s,e);
		int []r=sa.getSubArray();
		System.out.println("New Sub Array is: ");
		if(r!=null){
			for(int i=0;i<r.length;i++){
				System.out.println(r[i]+" ");
			}
		}
		else{
			System.out.println("Array is null.");
		}
		
		System.out.println("Enter a sum to find subarray: ");
		int n=sc.nextInt();
		FindSumSubArray fsws=new FindSumSubArray();
		fsws.setArray(arr);
		fsws.setValue(n);
		fsws.findSubArrayWithSum();
	}
}