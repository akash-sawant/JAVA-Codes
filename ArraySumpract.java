import java.util.*;
public class ArraySumpract
{
   public static void main(String x[])
    {
       int sum=0;
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
       System.out.println("Enter five values in array");
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
         System.out.printf("sum of all values is %d\n",sum);
    }
}