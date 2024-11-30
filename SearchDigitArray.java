import java.util.*;
public class SearchDigitArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		boolean flag=false;
		System.out.println("Enter the elements in the array");
		for(int i=0; i<a.length; i++)
		a[i]=sc.nextInt();
                System.out.println("Enter the serch key");
		int Search_Digit=sc.nextInt();
		
		         for(int i=0; i<a.length; i++)
			   {
				if(a[i]==Search_Digit)
                                {
				flag=true;
				break; 
				
			   }
                          }
	                 
		          if(flag)
			   {
				System.out.println("Value found");
			   }
		          else
			   {
				System.out.println("Value not found");
			  }
	            }
                 
              }