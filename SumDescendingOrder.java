import java.util.*;
public class SumDescendingOrder
{
    public static void main(String x[])
      {
	  int i,sum=0;
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  int b[]=new int[5];
	  System.out.println("Enter the values in the first array");
	  for(i=0; i<a.length; i++)
	{
	    a[i]=sc.nextInt();
	}
	System.out.println("Enter values in second array");
	for(i=0; i<a.length; i++)
	{
	   b[i]=sc.nextInt();
	}
	   int result[]=getMergeArray(a,b);
	  System.out.println("Display array after merged and sorted array");
	  for(i=0;i<result.length; i++)
	  { System.out.printf("%d\t",result[i]);
	  }
   }

	public static int[] getMergeArray(int m[],int n[])
	{
	    int t=0;
	    int k[]=new int[m.length + n.length];
	    for(int i=0; i<m.length; i++, t++)
	{
	     k[i]=m[i];
	}
	   for(int j=0; j<n.length; j++, t++)
	{
	     k[t]=n[j];
	}
	for(int i=0; i<k.length; i++)
	{
	     for(int j=i+1; j<k.length; j++)
		{
			if(k[i]<k[j])
			{
				int temp=k[i];
				k[i]=k[j];
				k[j]=temp;
			}
		}
	}
	    return k;
	}
           
}