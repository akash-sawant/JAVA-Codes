import java.util.*;

public class TwoDMatDeterminant 
	{
    		public static void main(String x[]) 
		{
        		Scanner sc = new Scanner(System.in);

       			 // Declare a 3x3 matrix
        		int[][] matrix = new int[3][3];

        		// Input the elements of the matrix
        		System.out.println("Input elements in the first matrix:");
        		for (int i=0; i<3; i++) 
			{
            			for (int j=0; j<3; j++) 
				{
                			System.out.print("element - [" + i + "][" + j + "] : ");
                			matrix[i][j] = sc.nextInt();
           			 }
        		}

       			 // Display the matrix
        		System.out.println("The matrix is:");
        		for (int i=0; i<3; i++) 
			{
            			for (int j=0; j<3; j++) 
				{
                			System.out.print(matrix[i][j] + " ");
            			}
            			System.out.println();
        		}

        		// Calculate the determinant of a 3x3 matrix
        		int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                        - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                        + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

        		// Display the determinant
        		System.out.println("The Determinant of the matrix is: " + determinant);
    		}
	}
