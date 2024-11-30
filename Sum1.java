import java.util.*;
public class Sum1
{
   public static void main(String x[])
   {
       int sum=0;
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
       System.out.println("Enter 5 elements in an array");
       for(int i=0; i<a.length; i++)
      {
         a[i]=sc.nextInt();
      }
      System.out.println("Display array values");
      for(int i=0; i<a.length; i++)
        {
             System.out.printf("%d\t",a[i]);
             sum=sum+a[i];
        }
        System.out.printf("sum is %d\n",sum);
   }
}