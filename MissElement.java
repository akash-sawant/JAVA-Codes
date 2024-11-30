import java.util.*;
class MissElement
{
  public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      int i,j,temp;
      System.out.println("ENter 5 elements");
      for(i=0; i<a.length; i++) 
	{                        //Array input
         a[i]=sc.nextInt();
	}
    for(i=0;i<a.length;i++)                     //Sorting logic
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
 System.out.printf("\nSorted Array");      //Missing Element s
      for(i=0;i<5;i++)
          System.out.print("  "+a[i]);
 
System.out.println("Missing Elements are:\n");
   for(i=0; i<5-1; i++)
    {
       for(j=a[i]+1; j<a[i+1]; j++)
          {
             System.out.print(j+" ");
          }
    }
  }
}










