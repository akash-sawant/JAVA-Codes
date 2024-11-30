import java.util.*;
 public class PolyMorphism_1
 { 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter int array size");
  int m=sc.nextInt();
  int a[]=new int[m];
  System.out.println("Enter integer array element");
  for(int i=0;i<m;i++)
  {
   a[i]=sc.nextInt();
  }

  System.out.println("Enter char array size");
  int n=sc.nextInt();
  char b[]=new char[n];
  System.out.println("Enter char array element");
  for(int i=0;i<n;i++)
  {
   b[i]=sc.next().charAt(0);
  }

  sortarr(a);
  sortarr(b);
 }
 
  
 public static void sortarr(int x[])
 {
  for(int i=0;i<x.length;i++)
  {
   for(int j=i+1;j<x.length;j++)
   {
    if(x[i]>x[j])
    {
     int temp=x[i];
     x[i]=x[j];
     x[j]=temp;
     
    }
   }
  }
  System.out.println("Sorted integer array is");
  for(int i=0;i<x.length;i++)
  {
   System.out.printf("%d ",x[i]);
  }
 }
 
 public static void sortarr(char y[])
 {
  for(int i=0;i<y.length;i++)
  {
   for(int j=i+1;j<y.length;j++)
   {
    if(y[i]>y[j])
    {
     char temp=y[i];
     y[i]=y[j];
     y[j]=temp;
    }
   }
  }
  System.out.println();
  System.out.println("Sorted char array is");
  for(int i=0;i<y.length;i++)
  {
   System.out.printf("%c ",y[i]);
  }
 }
 }