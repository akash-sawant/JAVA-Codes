import java.util.*;
public class ReverseArrayNo
{
   public static void main(String x[])
    {
	int i,j,temp;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter five elements in an array");
	for(i=0; i<a.length; i++)
	 {
	    a[i]=sc.nextInt();
	 } 
           System.out.println("Display values in an array");
	   for(i=0; i<a.length; i++)
           System.out.printf(a[i]+" ");
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
              System.out.println("\nAscending order array as follows");
              for(i=0; i<a.length; i++)
	      System.out.printf(a[i]+" ");
               int left=0;
               int right=a.length-1;
               
		while(left < right)
		{
		   temp=a[left];
		   a[left]=a[right];
		   a[right]=temp;
		   left++;
		   right--;
		}
              System.out.println("\nReverse array as follows :");
              for(i=0; i<a.length; i++)
              System.out.printf(a[i]+" ");
    }
}