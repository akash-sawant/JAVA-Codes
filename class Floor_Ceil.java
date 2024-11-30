import java.util.*;
public class Floor_Ceil
{
    public static void main(String x[])
   {
	int i,j,temp.floor=-1,ceil=-1,n;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the values in the array");
	for(i=0; i<a.length; i++);
	{
	     a[i]=sc.nextInt();
	}
	
	System.out.println("Display values in the array");
	for(i=0; i<a.length; i++)
	{	
	    System.out.printf(a[i]+" ");
	}
	
	for(i=0; i<a.length; i++)
	{
             for(j=i+1; i<a.length; j++)
	      {
		    if(a[i]>a[j])
		{
		    temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		}
	      }
	}
	System.out.println("Ascending order as follows");
	for(i=0; i<a.length; i++)
	{
	    System.out.println(a[i]+" ");
	}

	System.out.println("Enter the number");
	for(i=0; i<a.length; i++)
	{
	    if(a[i])<n && a[i+1]>n) 
		{
		    floor=a[i];
		    break;
		}
	    else if(a[i]>n)
		{
		    floor=-1;
		    break;
		}
	    else if(a[i]==n)
		{
		    floor=a[i];
		    break;
		}
	    else if(a[a.length-1]<n)
		{
		    floor=(a[a.length-1]);
		    break;
	       }
	}
	System.out.println("floot of the number"+n+"is"floor);	
   }
}