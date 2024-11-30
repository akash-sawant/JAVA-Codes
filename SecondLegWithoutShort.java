import java.util.*;
public class SecondLegWithoutShort
	{
		public static void main(String x[])
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int[5];
			System.out.println("Enter the Element:");
		
			for(int i=0; i<a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Second largest element is: ");
			int smax=0;           // for second largest element in array
			int max=0;           //for largest element in array
		
			for(int i=0; i<a.length; i++)
			{
				if(a[i]>max)        // checks if the current element a[i] is greater than max.
				{
					smax = max;   
					max = a[i];
				}
				else if(a[i]>smax && a[i]!=max)
				{
					smax = a[i];
				}
			}
		System.out.println(smax);	
	}
}