import java.util.*;
public class DescendingPractice
{
   public static void main(String x[])
   {
      int i,j,temp;
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter the values in array");
      for(i=0; i<a.length; i++)
       {
         a[i]=sc.nextInt();
       }
       System.out.println("Display values in array");
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
         System.out.println("\nArray is Ascending order is :");
	 for(i=0; i<a.length; i++)
	 System.out.print(a[i]+" ");
	

        for(i=0; i<a.length; i++)
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
        System.out.println("\nArray is descending order is :");
         for(i=0; i<a.length; i++)
         System.out.print(a[i]+" ");
         
      }
} 