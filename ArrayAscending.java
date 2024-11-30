import java.util.*;
public class ArrayAscending
{
    public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      int temp,i,j;
      System.out.println("Enter five values in array");
      for(i=0; i<5; i++)
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
        for(i=0; i<5; i++)
        System.out.printf("%d\t",a[i]); 
   }
}