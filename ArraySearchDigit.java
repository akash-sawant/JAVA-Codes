import java.util.*;
public class ArraySearchDigit
{
    public static void main(String x[])
   {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
       boolean flag=false;
       System.out.println("Enter values in array");
       for(int i=0; i<a.length; i++)
      {
         a[i]=sc.nextInt();
      }
        System.out.println("Enter search key");
        int skey=sc.nextInt();
        for(int i=0; i<a.length; i++)
       {
          if(a[i]==skey)
         {
           flag=true;
           break;
         }
       } 
      if(flag)
       {
         System.out.println("value found");
       }
       else
        {
          System.out.println("value not found");
        }
   }
}