import java.util.*;
public class MergeAlternateApp
{
    public static void main(String x[])
     {
	char first[]=new char[3];
	char second[]=new char[3];
	char result[]=new char[first.length + second.length];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values in the array");
	for(int i=0; i<first.length; i++)
	 {
	     first[i]=sc.nextLine().charAt(0);
	 }
	System.out.println("Enter values in second array");
	for(int j=0; j<second.length; j++)
	{
	    second[j]=sc.nextLine().charAt(0);
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
		System.out.println("Display array values");
		for(int i=0; i<result.length; i++)
		{
		    System.out.printf("%c",result[i]);
		}
     }
}