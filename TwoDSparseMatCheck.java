import java.util.*;

public class TwoDSparseMatCheck
	{
    		public static void main(String x[]) 
		{
        		Scanner sc = new Scanner(System.in);

        	// Input number of rows and columns
       		 System.out.print("Input the number of rows of the matrix: ");
        	int rows = sc.nextInt();
        	System.out.print("Input the number of columns of the matrix: ");
        	int cols = sc.nextInt();

        	// Declare the matrix
        	int[][] matrix = new int[rows][cols];

        	// Input the elements of the matrix
        	System.out.println("Input elements in the matrix:");
        	for (int i=0; i<rows; i++) 
		{
            		for (int j=0; j<cols; j++) 
			{
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            	}
        }
        	// Check for sparse matrix: Count zeros in the matrix
        	int zeroCount = 0;
        	int totalElements = rows * cols;

        	for (int i=0; i<rows; i++) 
		{
           		 for (int j=0; j<cols; j++) 
			{
                		if(matrix[i][j] == 0) 
				{
                    			zeroCount++;
                		}
            		}
        	}

        	// Determine if it's a sparse matrix (more than half of the elements are zero)
        	if (zeroCount > (totalElements / 2)) 
		{
            		System.out.println("The given matrix is a sparse matrix.");
        	} 
		else 
		{
            		System.out.println("The given matrix is not a sparse matrix.");
        	}

        	// Display the number of zeros
        	System.out.println("There are " + zeroCount + " number of zeros in the matrix.");
    	}
}
