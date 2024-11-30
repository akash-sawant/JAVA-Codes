import java.util.Scanner;
public class MissingArrayElement
{
   public static void main(String[]args)
   {
      Scanner scn=new Scanner(System.in);
      int  a[]=new int[5];
      System.out.println("Enter the element");
      for(int i=0;i<a.length;i++)
      a[i]=scn.nextInt();
      System.out.println("missing element are ");
      for(int i=0;i<a.length-1;i++)
	   {
		  for(int j=a[i]+1;j<a[i+1];j++)
		   {
			 System.out.println(j+"  ");
		   }
	   }
      
   }
}