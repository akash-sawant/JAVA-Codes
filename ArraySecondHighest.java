import java.util.*;
public class ArraySecondHighest
{
	public static void main(String x[])
	{
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the elements in the array");
		for(i=0; i<a.length; i++)
		a[i]=sc.nextInt();
		
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
                        System.out.println("\nSorted array is :");
			for(i=0; i<a.length-1; i++)
			System.out.println(a[i]+" ");
			
			System.out.println("\nSecond largest element is");
			int count=1;
			for(i=0; i<a.length-1; i++)
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