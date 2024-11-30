/*
  Q 43)....Write a program in C to find the second largest element in an array ?
Test Data :
Input the size of array : 5
Input 5 elements in the array :
element - 0 : 2
element - 1 : 9
element - 2 : 1
element - 3 : 4
element - 4 : 6
Expected Output :
The Second largest element in the array is : 6
*/


import java.util.*;
public class SecondLargestElement
{
    public static void main(String x[])
    {
        int i,j,temp;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the values in the array");
        for(i=0;i<a.length; i++)
      {
	 a[i]=sc.nextInt();
      }
	System.out.println("Display values in array");
	for(i=0; i<a.length; i++)
	System.out.println(a[i]+" ");
	for(i=0; i<a.length-1; i++)
	 {
	     for(j=i+1; j<a.length; j++)
	     {
                 if(a[i]<a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	     }
	 }
      }
	System.out.println("Descending order as follows :");
	for(i=0; i<a.length; i++)
	System.out.println(a[i]+" ");
	
	System.out.println("Second largest element is : ");
	int count=1; 
	for(i=0; i<a.length-1; i++)
	{
	    if(a[i]!=a[i+1])
	   {
		count ++;
	   }
	    if(count==2)
	        {
		   System.out.print(a[i+1]);
		}
	  }
     }
}