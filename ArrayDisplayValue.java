import java.util.*;
public class ArrayDisplayValue
{
    public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];  //array declared
      System.out.println("Enter five values in array");
      for(int i=0; i<a.length; i++)
     {
        a[i]=sc.nextInt();
     } 
      System.out.println("Display array values");
      for(int i=0; i<a.length; i++)
      {
         System.out.printf("%d\t",a[i]);
      }
   }
}