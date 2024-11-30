import java.util.*;
public class CheckAnagramApp
{
    public static void main(String x[])
     {
	int a[]=new int[5];
	int b[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first array");
	for(int i=0; i<a.length; i++)
	{
	    a[i]=sc.nextInt();
	}
	System.out.println("Enter values in second array");
	for(int i=0; i<a.length; i++)
	{
	    b[i]=sc.nextInt();	
	}
	boolean result=checkAnagramArray(a,b);
	if(result)
	{
	    System.out.println("Array is anagram");
	}
	else
	{
	    System.out.println("Array is not anagram");
	}
     }
    
      public static boolean checkAnagramArray(int m[], int n[])
	{
	     boolean flag=true;
	     for(int i=0; i<m.length; i++)
		{
			for(int j=(i+1); j<m.length; j++)
			{
			     if(m[i]>m[j])
				{
				    int temp=m[i];
				    m[i]=m[j];
				    m[j]=temp;
				}
                                 if(n[i]>n[j])
			            {
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
		          	    }
			}
                 }
 		for(int i=0; i<m.length; i++)
		{
		     if(m[i]!=n[i])
		    {
			flag=false;
			break;
		    }
		}
		return flag;
	    }
	}

