/* WAP to Create class name as ArrayParent with method 
void setArray(int a[]): this method is used for accept the array as parameter or accept integer array as parameter 
We have two child classes name as 
SubArray with method void setIndexes(int start,int end) you have to travel the array between two index and 
create sub new sub array and we have one method name as int [] getSubArray() 
This method can return sub array which is between two index which we pass in setIndexes() methods 
We have one more class name as FindSumSubArray with two methods 
void setValue(int value): this method can accept one integer parameter and we have one method name as void findSubArrayWithSum()
This method help us the sub array whose element sum is equal with value pass in setValue() function  and one method name as int [] getSubArray()
 this  method can return values of sub array which is equal with value pass in setvalue() and if sum is not equal with value pass in setValue() then return nu
*/

import java.util.Scanner;
class ArrayParent{
	int a[];
	void setArray(int a[]){
		this.a=a;
	}
}
class SubArray extends ArrayParent{
	int start index;
	int end index;
	
	void setIndexes(int start ,int end){
		this.start=start;
		this.end=end;
		
		int []getSubArray(){
			int size=0;
			int arr[];
			for(int i=0;i<a.length;i++){
				if(start>=a.length){
					System.out.println("Invalid Entry:");
					break;
				}
				else if(i>=start && i<=end){
					size++;
				}
				arr=new int[size];
				int index=0;
				for(int i=0;i<a.length;i++){
					if(start>a.length-1){
						System.out.println("Invalid entry:");
						break;
					}
					else if(i>=start && i<=end){
						arr[index]=a[i];
						index++;
					}
				}
				return arr;
			}
		}
	}
class FindSumSubArray{
	int value=0;
	void setValue(int value){
		this.value=value;
	}
	void findSubArrayWithSum(){
		for(int start=0;start.length;start++){
			int sum=0;
			for(int end =start;end.length;end++){
				sum=sum+[end];
				if(sum==value){
					int size=end-start+1;
					int[] subArray=new int[size];
					for(int i=0;i<size;i++){
						subArray[i]=a[start-1];
					}
					return subArray;
				}
			}
		}
		System.out.println("SubArray sum found:");
		return null;
	}
}
public class SubArrayInhApp{
	
}

