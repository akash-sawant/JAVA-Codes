public class position
{
   public static void main(String x[])
   {
       int a[]=new int[5];
       int b[];
       b=a;
       b[1]=100;
       System.out.println("Display array values");
       for(int i=0; i<a.length; i++)
       {
          System.out.printf("%d\n",a[i]);
       }
   }
}