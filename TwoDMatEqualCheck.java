import java.util.*;

public class TwoDMatEqualCheck 
	{
    		public static void main(String[] args) 
		{
        		Scanner sc = new Scanner(System.in);

        	// Input the number of rows and columns for the first matrix
       		 System.out.print("Input Rows and Columns of the 1st matrix: ");
        	 int rows1 = sc.nextInt();
        	 int cols1 = sc.nextInt();

        	// Input the number of rows and columns for the second matrix
        	System.out.print("Input Rows and Columns of the 2nd matrix: ");
        	int rows2 = sc.nextInt();
        	int cols2 = sc.nextInt();

        	// Check if dimensions of both matrices are the same
        	if (rows1 != rows2 || cols1 != cols2) 
		{
            		System.out.println("The matrices cannot be compared because they have different dimensions.");
            		return;
        	}

        	// Declare the first and second matrices
        	int[][] matrix1 = new int[rows1][cols1];
        	int[][] matrix2 = new int[rows2][cols2];

       		 // Input elements for the first matrix
        	System.out.println("Input elements in the first matrix:");
        	for (int i=0; i<rows1; i++) 
		{
            		for (int j=0; j<cols1; j++) 
			{
                		System.out.print("element - [" + i + "],[" + j + "] : ");
                		matrix1[i][j] = sc.nextInt();
            		}
        	}

        	// Input elements for the second matrix
       		System.out.println("Input elements in the second matrix:");
        	for (int i=0; i<rows2; i++) 
		{
            		for (int j=0; j<cols2; j++) 
			{
               			System.out.print("element - [" + i + "],[" + j + "] : ");
                		matrix2[i][j] = sc.nextInt();
            		}
        	}

        	// Display the first matrix
        	System.out.println("The first matrix is:");
        	for (int i = 0; i < rows1; i++) 
		{
            		for (int j = 0; j < cols1; j++) {
                	System.out.print(matrix1[i][j] + " ");
            	}
            System.out.println();
        }

        	// Display the second matrix
       		 System.out.println("The second matrix is:");
        	for (int i=0; i<rows2; i++) 
		{
            		for (int j=0; j<cols2; j++) 
			{
                		System.out.print(matrix2[i][j] + " ");
            		}
           			 System.out.println();
        	}

        	// Check if both matrices are equal
        	boolean flag = true;
        	for (int i=0; i<rows1; i++) 
		{
            		for (int j=0; j<cols1; j++) 
			{
               			 if (matrix1[i][j] != matrix2[i][j]) 
				{
                    			flag = false;
                    			break;
                		}
            		}
        	}

       		 // Display the result
        	if (flag) 
		{
            		System.out.println("The Matrices can be compared: Two matrices are equal.");
        	} 
		else 
		{
            		System.out.println("The Matrices can be compared: Two matrices are not equal.");
        	}
    	}
}
