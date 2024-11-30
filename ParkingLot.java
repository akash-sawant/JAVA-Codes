import java.util.*;
public class ParkingLot
{
    public static void main(String x[])
     {
	Scanner sc=new Scanner(System.in);
	int R=sc.nextInt();
	int C=sc.nextInt();
	int[][] parkingLot=new int[R][C];
	
	for(int i=0; i<R; i++)
	{
	   for(int j=0; j<C; j++)
	   {
	      parkingLot[i][j]=sc.nextInt();
	   }
	}


	int maxOnes=0;
	int rowIndex= -1;
	
	for(int i=0; i<R; i++)
	{
	    int onesCount=0;
	    for(int j=0; j<C; j++)
	   {
	      if(parkingLot[i][j]==1)
		{
		   onesCount++;  
		}
	   }
		if(onesCount > maxOnes)
		{
		  maxOnes = onesCount;
                  rowIndex =i+1;  
		}
	}
		System.out.println(rowIndex);
		
     }
}
