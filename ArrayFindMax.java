import java.util.*;
public class ArrayFindMax
{
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter the array values");
      for(int i=0; i<a.length; i++)
        {
           a[i]=sc.nextInt();
        }
       int max=a[0];
       for(int i=0; i<a.length; i++)
         {
            if(a[i]>max)
           {
              max=a[i];           
           }
         }
      System.out.printf("Max value is :"+max);
   }
}