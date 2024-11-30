import java.util.*;
public class Floor_Ceil
{
    public static void main(String x[])
   {
	int i,j,temp,floor=-1,n,ceil=-1;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	System.out.println("Enter the values in the array");
	for(i=0; i<a.length; i++)
	{
	     a[i]=sc.nextInt();
	}
	
	System.out.println("Enter the number");
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
		    ceil=a[i];
		    break;
		}
	    else if(a[a.length-1]<n)
		{
		    floor=(a[a.length-1]);
		    ceil=-1;
		    break;
	       }
            else if(a[i]==n)
		{
		    floor=a[i];
		    ceil=a[i];
		    break;
		}
            else if(a[i]<n && a[i+1]>n) 
		{
		    floor=a[i];
		    ceil=a[i+1];
		    break;
		}
	}
	System.out.println("Floor of "+n+" is "+floor);
	System.out.println("Ceil of "+n+" is "+ceil);
   }
}