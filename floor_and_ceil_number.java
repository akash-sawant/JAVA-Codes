/*Q48)........
Write a program in C to find the Floor and Ceil of the number 0 to 10 from a sroted array.
Expected Output :
The given array is : 1 3 5 7 8 9
Number: 0 ceiling is: 1 floor is: -1
Number: 1 ceiling is: 1 floor is: 1
Number: 2 ceiling is: 3 floor is: 1
Number: 3 ceiling is: 3 floor is: 3
Number: 4 ceiling is: 5 floor is: 3
Number: 5 ceiling is: 5 floor is: 5
Number: 6 ceiling is: 7 floor is: 5
Number: 7 ceiling is: 7 floor is: 7
Number: 8 ceiling is: 8 floor is: 8
Number: 9 ceiling is: 9 floor is: 9
Number: 10 ceiling is: -1 floor is: 9
*/


import java.util.*;
public class floor_and_ceil_number
  {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int n,floor=-1,ceil=-1;
		System.out.println("Enter the Five element");
 
                for(int i=0;i<a.length;i++)
		
	        a[i]=sc.nextInt();
                
                System.out.println("Enter the number");
                n=sc.nextInt();
 	

               for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;			
				}
			}
		}
                   for( n=0;n<=10;n++)
                 {

                 for(int i=0;i<a.length;i++)
		{
			if(a[i]>n)
			{
				floor=-1;
				ceil=a[i];
				break;

			}
			else if(a[a.length-1]<n)
			{
				floor=a[a.length-1];
				ceil=-1;
				break;
			}
			else if(a[i]==n)
			{
				floor=a[i];
				ceil=a[i];
				break;
			}
			else if(a[i]<n && a[i+1]>n)
			{
				floor=a[i];
				ceil=a[i+1];
				break;
			}
		}
                System.out.println("Number : " + n + " floor is: " + floor +" ceil is : " +ceil);	
            }    
	}
  }

