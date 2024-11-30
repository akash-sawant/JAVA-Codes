import java.util.*;
public class ArrayOccurance
{
   public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i,j,temp,count;
        System.out.println("Enter five elements in array");
        for(i=0; i<a.length; i++)
           {
              a[i]=sc.nextInt();
           }
         for(i=0; i<a.length; i++)
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
     		System.out.println("Sorted array");
                for(i=0; i<a.length; i++)
		{
		     System.out.println(a[i]+" ");
	 	}
                 System.out.println("Occurance of array is :");
                 count=1;
                 for(i=0; i<a.length; i++)
               {
                  if(i==a.length-1)  
     		   {
                       System.out.println(a[i]+"----"+count+" times");
        	    }
       			 else if(a[i]==a[i+1])
       				 {
           		           count++;
         			 }
     			  else
       				  {
        			       System.out.println(a[i]+"----"+count+" times");
              			       count=1;
    			    }
    		  } 
    	}
}


