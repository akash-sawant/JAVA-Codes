import java.util.*;
public class Descending
{
   public static void main(String x[])
    {
       int j,temp;
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
       System.out.println("Enter five vallues in ana array");
       for(int i=0; i<a.length; i++)
        {
          a[i]=sc.nextInt();
        }
       System.out.println("Display values in an array");
       for(int i=0; i<a.length; i++)
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
       System.out.println("Sorted array is as follows");
       for(int i=0; i<a.length; i++)
         {
             System.out.printf(a[i]+" ");
         }
    }
}