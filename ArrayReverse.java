import java.util.*;
public class ArrayReverse
{
   public static void main(String x[])
    {
       	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
        int i,j,temp;
	System.out.println("Enter the elements in the array :");
	for(i=0; i<a.length; i++)
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
 		System.out.println("Sorted Array :");
 		for(i=0; i<a.length; i++)
		System.out.printf(a[i]+" ");
	for(i=0; i<a.length; i++)
	{	     int left=0;
             int right=a.length-1;
	     

		while(left<right)
		   {
 			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		   }
	}
		System.out.println("\nReverse array is :");
		for(i=0; i<a.length; i++)
		    System.out.print(a[i]+" ");
    }
}