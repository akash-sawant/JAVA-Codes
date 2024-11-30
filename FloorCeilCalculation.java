import java.util.*;
public class FloorCeilCalculation
{
	public static void main(String x[])
	{
		int i,j,temp,floor=-1,ceil=-1,no;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the values in the array");
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
		System.out.println("Sorted array is as follows");
		for(i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter the number to find hte floor and ceil");
		no=sc.nextInt();
		for(i=0; i<a.length; i++)
		{
			if(a[i]>no)
			{
				floor=-1;
				ceil=a[i];
				break;
			}
			else if(a[i]==no)
			{
				floor=a[i];
				ceil=a[i];
				break;
			}
			else if(a[a.length-1]<no)
			{
				floor=a[a.length-1];
				ceil=-1;
				break;
			}
			else if(a[i]<no && a[i+1]>no)
			{
				floor=a[i];
				ceil=a[i+1];
				break;
			}
		}
		System.out.println("the floor of " + no + " is: "+floor);
		System.out.println("the ceil of " + no + " is: "+ceil);
	}
}
