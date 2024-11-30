import java.util.*;
public class Ascendingpractice
{
   public static void main(String x[])
    {
        int i,j,temp;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter elements in array");
        for(i=0; i<a.length; i++)
         {
           a[i]=sc.nextInt();
         }
        System.out.println("Display array values");
        for(i=0; i<a.length; i++)
        System.out.print(a[i]+" ");
        for(i=0; i<a.length; i++)
         {
            for(j=i+1; j<a.length; j++)
             {
                 if(a[i]>a[j])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
             }
         }
           System.out.println("\nAscending order as follows");
           for(i=0; i<a.length; i++)
          {
            System.out.printf(a[i]+" ");
          }
    }
}