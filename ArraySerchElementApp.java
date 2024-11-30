import java.util.*;
public class ArraySerchElementApp
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
     int a[]=new int[5];
     boolean flag=false;
     System.out.println("Enter the element");
     for(int i=0;i<a.length;i++)
     a[i]=sc.nextInt();
	  
          System.out.println("Enter the serch key");
	  int serch_element=sc.nextInt();
	  
	  for(int i=0;i<a.length;i++)
	  {
		 if(a[i]==serch_element)
		  {
			flag=true;
			break;
		  }
	  }
		  if(flag)
		  {
			 System.out.println("value found");
		  }
		  else
		  {
			System.out.println("Value not found");
		  }
		 
	  
	 
  }
}