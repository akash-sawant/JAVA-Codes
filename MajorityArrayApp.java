import java.util.*;
public class MajorityArrayApp
 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();	
		int a[]=new int[size];
		System.out.println("Enter the elemnt");
                for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int result=getMajority(count);
		System.out.println(result);
	}

	public static int getMajority(int count)
	{	
		boolean flag=false;
		
		int count=0;
		int mcount=0;
		int element=0;


                for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			 }
                                if(count>mcount)	
				{
					count=mcount;
					element=i;
				}

			}
                        if(mcount>(size/2))
			{
				flag=true;
				break
				System.out.println("it is majority array");
			}
			else
			{
                                System.out.println("The gievn array is not the majority array");
			}
		}	
			return count
 	}
}