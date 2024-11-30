import java.util.*;
public class ArrayMissElement
{
   public static void main(String x[])
     {
	Scanner sc=new Scanner(System.in);
 	int a[]=new int[5];
        int i,j,temp;
        System.out.println("Enter five elements in array");
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
            for(i=0; i<5; i++)
		    System.out.printf(" "+a[i]);
                    System.out.println("\n Missing Elements are\n");
                    for(i=0; i<a.length-1; i++)
                  {
                     for(j=a[i]+1; j<a[i+1]; j++)
                     {
                        System.out.printf("\t%d",j);
                      }
                  }
	       
       }
}


        
 







