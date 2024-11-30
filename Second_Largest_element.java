import java.util.*;
public class Second_Largest_element
{
     public static void main(String x[])
     {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the values in the array");
	for(int i=0; i<a.length; i++)
	  {
	      a[i]=sc.nextInt();
	  }
	    System.out.println("Display values in array");
	    for(int i=0; i<a.length; i++)
	    System.out.println(a[i]+" ");
	   
	     for(int i=0; i<a.length-1; i++)
	   {
              for(int j=i+1; j<a.length; j++)
		{
		    if(a[i]<a[j])
                   {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		   }
		}
	   }

                System.out.println("Ascending order as follows :");
           	for(int i=0; i<a.length; i++)
             	System.out.println(a[i]+" ");


		System.out.println("Second largest element is :");
		int count=1;
		for(int i=0; i<a.length-1; i++)
		{
		     if(a[i]!=a[i+1])
			{
			    count++;
			    
			}
			if(count==2)
				{
				    System.out.println(a[i+1]);
				}
		}
     }
}