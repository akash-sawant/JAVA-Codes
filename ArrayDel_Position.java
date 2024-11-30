import java.util.Scanner;
public class ArrayDel_Position
{
   public static void main(String[]args)
   {
          Scanner sc=new Scanner(System.in);
          int a[]=new int[5];
          System.out.println("enter the number");
          
         for(int i=0;i<a.length;i++)
         a[i]=sc.nextInt();	
         System.out.println("Romove the element");
         int del_element=sc.nextInt();
         for(int i=0;i<a.length;i++)
        {
            if(i==del_element)
           {
              for(int j=i;j<a.length-1;j++)
               {
                  a[j]=a[j+1];
               }
           }
        }
         System.out.println("After postion Element");
         for(int i=0;i<a.length-1;i++) 
          {
                System.out.println(a[i]+ "  ");
          }
   }
}