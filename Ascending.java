import java.util.*;
public class Ascending
{
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      int i,j,temp;
      System.out.println("Enter values in array");
      for(i=0; i<a.length; i++)
       {
          a[i]=sc.nextInt();
       }
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
         System.out.println("Sorted array");
         for(int i=0; i<a.length; i++)
         System.out.printf(a[i]+" ");
   }
}
