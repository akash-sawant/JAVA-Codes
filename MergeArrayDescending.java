import java.util.*;
public class MergeArrayDescending
{  
   public static void main(String x[])
     {  
          int a[]=new int[5];
	  int b[]=new int[5];
	  Scanner xyz =new Scanner(System.in);
	  System.out.println("enter value in first array");
	  for(int i=0; i<a.length; i++)
	  {
	      a[i]=xyz.nextInt();
	  }
	  System.out.println("Enter values in second array");
	  for(int i=0; i<a.length; i++)
	  {
	      b[i]=xyz.nextInt();
	  }
	  int result[]=getMergeArray(a,b);
	  sortDescending(result);
          System.out.println("Display array after merging and sorting in descending order:");
          for (int i=0; i<result.length; i++) {
          System.out.printf("%d\t", result[i]);
     }
  }
            public static int[] getMergeArray(int m[],int n[])
	{   
	        int t=0;
	        int k[]=new int[m.length + n.length];
		for(int i=0; i<m.length; i++, t++)
		{ 
		     k[t]=m[i];
		}
		for(int j=0; j<n.length; j++, t++)
		{
		    k[t]=n[j];
		}
		return k;
	}
        public static void sortDescending(int a[]) 
	{
        int temp;
        for (int i=0; i<a.length; i++) 
	   {
            for (int j=i+1; j<a.length; j++) 
		{
                if (a[i]<a[j]) 
		   {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }	    
}
