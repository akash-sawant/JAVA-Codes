import java.util.*;
public class ceil_calculation
{
	public static void main(String x[])
	{
		int i,j,ceil=-1,temp,no;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the values in array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}

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
		System.out.println("Sorted array is :");
		for(i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println("Enter the value to check ceil of no :");
		no=sc.nextInt();
		for(i=0; i<a.length; i++)
		{
			if(a[i]>no)
			{
				ceil=a[i];
				break;
			}
			else if(a[i]==no)
			{
				ceil=a[i];
				break;
			}
			else if(a[a.length-1]<no)
			{
				ceil=-1;
				break;
			}
			else if(a[i]<no && a[i+1]>no)
			{
				ceil=a[i+1];
				break;
			}
		}
			System.out.println("the ceil of"+no+"is"+ceil);
	}
}