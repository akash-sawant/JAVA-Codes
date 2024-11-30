/*/public static void sum(int a[]): this function can accept integer array as parameter and calculate its sum
public static void sum(char[]): this function can accept character array and extract digit from it and cal sum it 
Example: abc123mno45s 
Output: 1+2+3+4+5
*/


 import java.util.*;
 public class Secondnumber
 {
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the integer array:");
        int n = sc.nextInt();  
        int[] a = new int[n];   
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < a.length; i++)
         {  
            a[i] = sc.nextInt();
        }

        
        System.out.println("Enter a string of characters (can include digits):");
        String inputString = sc.next(); 
        char[] b = inputString.toCharArray();  

        sum(a);
        sum(b);
  
 }
 public static void sum(int x[])
 {
  int sum=0;
  for(int i=0;i<x.length;i++)
  {
   sum=sum+x[i];
  }
  
  System.out.printf("Sum is : %d\n",sum);
 }
 public static void sum(char y[])
 {
   int digitSum = 0;
   for (int i = 0; i < y.length; i++) 
	{
            if (Character.isDigit(y[i]))
		 {  
                    digitSum += Character.getNumericValue(y[i]); 
                 }
          }
      System.out.printf("Sum of digits in the character array is: %d\n", digitSum);
    }
}