import java.util.*;
public class ArrayMaxiMiniApp
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("Enter the number");
	    for(int i=0;i<a.length;i++)
	   {
		  a[i]=sc.nextInt();
	   }
	   
	   int max=0;
	   int min=a[0];
	   
	    for(int i=0;i<a.length;i++)
	   {
		  if(a[i]>max)
		   {
			  max=a[i];
		   }
	   }
	   
	    for(int i=0;i<a.length;i++)
	   {
		  if(a[i]<min)
		   {
			 min=a[i];
		   }
	   }
	    System.out.println("mix is : "+max);
    System.out.println("min is : "+min);
  
   }


}