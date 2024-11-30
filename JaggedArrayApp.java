import java.util.*;
public class JaggedArrayApp
{
    public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	   int a[][]=new int[3][];
	   a[0]=new int[3];
	   a[1]=new int[3];
	   a[2]=new int[3];
	   System.out.println("Enter values in array");
	   for(int i=0; i<a.length;i++)
	   {  
	       for(int j=0;j<a[i].length; j++)
		   {
		      a[i][j]=xyz.nextInt();
		   }
	   }
	   System.out.println("display the array values");
	   for(int i=0; i<a.length;i++)
	   { 
	       for(int j=0;j<a[i].length;j++)
		   {  System.out.printf("%d\t",a[i][j]);
		   }
		   System.out.printf("\n");
	   }
	
	}
}
