import java.util.*;
public class SecondLargestArray
{
   public static void main(String agrs[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.print("Enter input: ");
	for(int i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
		if(a[i]<a[j])
		{
		   int temp=a[i];
		   a[i]=a[j];
		   a[j]=temp;
		}
	   }
	}
	
	System.out.println("Second Largest Element is :");
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
