import java.util.*;

public class TwoDUpperTriaMat 
	{
    		public static void main(String x[]) 
		{
        		Scanner sc = new Scanner(System.in);
        		System.out.print("Input the size of the square matrix: ");
        		int size = sc.nextInt();

        		int[][] matrix = new int[size][size];

        		// Input elements in the matrix
        		System.out.println("Input elements in the first matrix:");
        		for (int i=0; i<size; i++) 
			{
           			 for (int j=0; j<size; j++) 
				{
                			System.out.print("element - [" + i + "],[" + j + "] : ");
                			matrix[i][j] = sc.nextInt();
            			}
        		}

       			 // Display the original matrix
        		System.out.println("The matrix is:");
        		for (int i=0; i<size; i++) 
			{
            			for (int j=0; j<size; j++) 
				{
                			System.out.print(matrix[i][j] + " ");
            			}
            			System.out.println();
        		}

        		// Set upper triangular elements to 0 and display the modified matrix
        		System.out.println("Setting zero in upper triangular matrix:");
        		for (int i=0; i<size; i++) 
			{
            			for (int j=0; j<size; j++)
				 {
                			if (j>i) 
					{
                    				matrix[i][j] = 0; // Set upper triangular elements to 0
                			}
            			}
        }

       			 // Display the modified matrix
        		for (int i=0; i<size; i++) 
			{
            			for (int j=0; j<size; j++) 
				{
                			System.out.print(matrix[i][j] + " ");
           			 }
           			 System.out.println();
        		}
   	 }
}
