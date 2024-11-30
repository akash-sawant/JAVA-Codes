import java.util.*;
public class SmallestMissingElement 
{
	public static void main(String x[])
	{
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter values in the array");
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
		System.out.println("missing smallest number :");
		int count=0;
		for(i=0; i<a.length-1; i++)
		    {
			for(j=a[i]+1;j<a[i+1];j++)
			{
				System.out.println(j+"");
				count++;
				break;
			}
				if(count!=0)
				{
					break;
				}
		    }
			
	}
}