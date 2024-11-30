import java.util.*;
public class ExtractDigitSum
{
    public static void main(String x[])
    {
	Scanner sc=new Scanner(System.in);
	char ch[]=new char[10];
	System.out.println("Enter data in character array");
	for(int i=0; i<ch.length; i++)
	{
	   ch[i]=sc.nextLine().charAt(0);
	}
	int sum=getDigitSum(ch);
	System.out.println("sum of digit is : "+sum);
    }
	public static int getDigitSum(char ch[])
	{
	    int s=0;
	    for(int i=0; i<ch.length; i++)
	   {
	       if(ch[i]>=48 && ch[i]<=57)
		{
		    s=s+((int)ch[i]-48);
		}
	   }
	      return s;
	} 
}