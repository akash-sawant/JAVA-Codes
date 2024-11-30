import java.util.*;
public class MergeAlternateInt
{
     public static void main(String x[])
    {
	int first[]=new int[3];
	int second[]=new int[3];
	int result[]=new int[first.length + second.length];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values in first array :");
	for(int i=0; i<first.length; i++)
	{
	   first[i]=sc.nextInt();
	}
	System.out.println("Enter values in second array :");
	for(int j=0; j<second.length; j++)
	{
	   second[j]=sc.nextInt();
	}
	for(int i=0, f=0, s=0; i<result.length; i++)
	{
	    if(i%2==0)
	   {
	       result[i]=first[f];
	       f++;
	   }
	   else
	   {
		result[i]=second[s];
	        s++;
           }
	}
		System.out.printf("Display array values");
	        for(int i=0; i<result.length; i++)
		{
		    System.out.printf("%d\t",result[i]);
		}
    }
}