/*Q 50)....
Write a program in C to to print next greater elements in a given unsorted array. Elements for which no greater element exist, consider next greater element as -1.
Expected Output :
The given array is : 5 3 10 9 6 13
Next Bigger Elements are:
Next bigger element of 5 in the array is: 10
Next bigger element of 3 in the array is: 10
Next bigger element of 10 in the array is: 13
Next bigger element of 9 in the array is: 13
Next bigger element of 6 in the array is: 13
Next bigger element of 13 in the array is: -1
Next Bigger Elements Array:
10 10 13 13 13 -1
*/


import java.util.*;
public class NextBiggestElement
{
     public static void main(String args[])
  	 {
		Scanner sc=new Scanner(System.in);
 		int arr[]=new int[6];
 		int newarray[]=new int[6];
 		System.out.println("Enter input: ");
 		for(int i=0;i<arr.length;i++)
 		{
    			arr[i]=sc.nextInt();
 		}
 		int element=0;
	        System.out.println("Next Bigger Elements are: ");
 		for(int i=0;i<arr.length;i++)
 		{
    			boolean flag=false;
    			for(int j=i+1;j<arr.length;j++)
    			{
  				if(arr[i]<arr[j])
  				{
   					  System.out.print("Next Bigger Element of "+arr[i]+" in the array is: "+arr[j]+"\n");
     					  newarray[element++]=arr[j];
    					  flag=true;
     					  break;
  				}
  
  			  }
   				 if(!flag)
    				{
  					System.out.print("Next Bigger Element of "+arr[i]+" in the array is: "+"-1"+"\n");
  					newarray[element++]= -1;
   				}
 			}
 				System.out.println("Next Bigger Elements Array: ");
 				for(int i=0;i<newarray.length;i++)
 				{
  					  System.out.print(newarray[i]+" ");
 				}
 		       }
	}