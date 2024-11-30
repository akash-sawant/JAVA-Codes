import java.util.*;
public class MaxAndMinPract
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
       int min=a[0];
       int max=a[0];
       for(int i=0; i<a.length; i++)
          {
             if(a[i]<min && a[i]>max)
             {
		min=a[i];
                max=a[i];
             }
          }
       System.out.printf("minimum value is : %d\n",+min,+max);
  }
}