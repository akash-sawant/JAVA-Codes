import java.util.*;
public class ArrayMerge
{
     public static void main(String x[])
       {
	    Scanner sc=new Scanner(System.in);
	    int a[]=new int[5];
	    int b[]=new int[5];
	    System.out.println("Enter the values in first array");
	    for(i=0; i<a.length; i++)
	    {
		a[i]=sc.nextInt();
	    }
	    System.out.println("Enter the values in second array");
	    for(i=0; i<a.length; i++)
	    {
		b[i]=sc.nextInt();
	    }
	    int result[]=getMergeArray(a,b);
	    System.out.println("Display array after merging");
	    for(int i=0; i<a.length; i++)
		{
		    System.out.printf("%d\t",result[i]);
		}   
	    
	   public static int[] getMergeArray(int m[], int n[]);
	   int t=0;
	   int k[]=new int[m.length + n.length]
           for(int i=0; i<m.length; i++, t++)
		{
			k[i]=m[i];
		}
                   for(int j=0; j<n.length; j++, t++)
		{
			k[t]=n[j];
		}
		return k;
     }  
}