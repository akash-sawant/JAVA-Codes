import java.util.*;
public class RevArray
{
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter 5 values in array");
      for(int i=0; i<a.length; i++)
      {
         a[i]=sc.nextInt();
      }
       for(int i=0; i<a.length; i++)
      {
         int left=0;
         int right=a.length-1;
      
          while(left<right)
         {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            right--;
            left++;
         }
      }
        System.out.println("Reverse array");
        for(int j=0; j<a.length; j++)
         {
            System.out.println(a[j]+" ");
         }
   }
}