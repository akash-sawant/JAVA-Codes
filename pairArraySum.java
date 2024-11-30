/*
Q 44)......
  Write a program in C to find a pair with given sum in the array. 
Expected Output :
The given array : 6 8 4 -5 7 9
The given sum : 15
Pair of elements can make the given sum by the value of index 0 and 5
*/


import java.util.*;
public class pairArraySum
 {
     public static void main(String[]args)
     {
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[6];
	  int sum=15;
	  System.out.println("Enter the number");
 
          for(int i=0;i<a.length;i++)
	 {
		a[i]=sc.nextInt();
	 }
 
           int count=0;

          for(int i=0;i<a.length;i++)
	  {
		for(int j=i+1; j<a.length; j++)
		{
			if(sum==a[i]+a[j])
                       {
				System.out.println("Pair of elements can make the given sum by the value of index "+i+" and " +j);
                                count=1;
				break;
		       }
		}
                if(count==1)
                break;   
	  }
     }
 }