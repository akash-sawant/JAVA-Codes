import java.util.*;
public class MissingValue
{
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      int i,j,temp;
      System.out.println("Enter elements in array");
      for(i=0; i<5; i++)
      a[i]=sc.nextInt();
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
 		System.out.printf("\n Sorted Array");
 		for(i=1; i<a.length; i++)
		System.out.print(" "+a[i]);
                System.out.printf("\nMissing Elements are\n");
 		for(i=0; i<a.length-1; i++)
		{
			for(j=a[i]+1; j<a[i+1]; j++)
			   {
                              for(i=0; i<a.length; i++)
			      System.out.printf("\t %d",j);	
			    }
		}
       }
  
}








