import java.util.*;
public class Floor_Calculate
{
	public static void main(String x[])
	{
	      int i,j,temp,floor=-1,n;
	      Scanner sc=new Scanner(System.in);
	      int a[]=new int[5];
	      System.out.println("Enter values in the array");
	      for(i=0; i<a.length; i++)
		{
		    a[i]=sc.nextInt();
	  	}
		System.out.println("Enter a number");
           	n=sc.nextInt();
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
		for(i=0; i<a.length; i++)
		{
		    if(a[i]>n)
		     {
			floor=-1;
			break;
		     }  
		   else if(a[a.length-1]<n)
		     {
			 floor=a[a.length-1];
			 break;
		     }
		   else if(a[i]==n)
		     {
			floor=a[i];
			break;
                     }
		   else if(a[i]<n && a[i+1]>n)
		     {
			floor=a[i];
			break;
		     }
		}
		System.out.println("Floor of "+n+" is "+floor);

		
	}
}