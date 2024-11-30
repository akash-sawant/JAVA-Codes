import java.util.Scanner;
public class MergedArray{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		
		// Enter the Size of First Array
		System.out.println("Enter the Size of First Array:");
		int size1=scn.nextInt();
		int [] a1=new int[size1];
		
		// Enter the Number of First Array
		System.out.println("Enter the First array:");
		for(int i=0;i<size1;i++){
			a1[i]=scn.nextInt();
		}
		
		
		// Enter the Size of Second Array
		System.out.println("Enter the Size of Second Array:");
		int size2=scn.nextInt();
		int [] a2=new int[size2];
		
		// Enter the Number Array
		System.out.println("Enter the Second array:");
		for(int i=0;i<size2;i++){
			a2[i]=scn.nextInt();
		}
		
		 // Merged the two array
		int [] mergedArray=new int[size1+size2];
		int index=0;
		
		for(int i=0;i<size1;i++){
			mergedArray[index++]=a1[i];
		}
		for(int i=0;i<size2;i++){
			mergedArray[index++]=a2[i];
		}
		
		
		//Dipslay the merged array
		
		System.out.println("Merged array:");
		for(int i=0;i<mergedArray.length;i++){
			System.out.println(mergedArray[i]+"  ");
		}
	}
}