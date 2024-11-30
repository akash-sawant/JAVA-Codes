import java.util.*;

public class TwoDMatrixSubtraction
	{
    		public static void main(String[] args) 
		{
        		Scanner sc = new Scanner(System.in);
        		System.out.print("Input the size of the square matrix (less than 5): ");
       		 	int size = sc.nextInt();

        		// Check if the size is valid
        		if (size < 1 || size >= 5) 
			{
            			System.out.println("Size must be between 1 and 4.");
            			return;
        		}
        		int matrix1 [][] = new int[size][size];
       			int matrix2[][] = new int[size][size];
        		int subMatrix[][] = new int[size][size];

        		// Input elements for the first matrix
        		System.out.println("Input elements in the first matrix :");
        		for (int i=0; i<size; i++) 
			{
            			for(int j=0; j<size; j++) 
				{
               				System.out.printf("element - [%d],[%d] : ", i, j);
                			matrix1[i][j] = sc.nextInt();
            			}
       			 }

        		// Input elements for the second matrix
        		System.out.println("Input elements in the second matrix :");
        		for (int i=0; i<size; i++) 
			{
            			for (int j=0; j<size; j++) 
				{
                			System.out.printf("element - [%d],[%d] : ", i, j);
                			matrix2[i][j] = sc.nextInt();
            			}
        		}

        		// Display the first matrix
        		System.out.println("The First matrix is :");
        		for (int i=0; i<size; i++) 
			{
            			for (int j=0; j<size; j++) 
				{
                			System.out.printf("%d ", matrix1[i][j]);
           			 }
            				System.out.println();
       			 }

       			 // Display the second matrix
        		System.out.println("The Second matrix is :");
        		for (int i=0; i<size; i++) 
			{
            			for (int j=0; j<size; j++) 
				{
                			System.out.printf("%d ", matrix2[i][j]);
            			}
           			 System.out.println();
        		}

        		// Calculate the sub of the matrices
        		for (int i=0; i<size; i++) 
			{
            			for (int j=0; j<size; j++) 
				{
                			subMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            			}
        		}

        		// Display the sum of the matrices
       			System.out.println("The Subtraction of two matrix is :");
        		for (int i=0; i<size; i++) 
			{
           			 for(int j=0; j<size; j++) 
				{
                			System.out.printf("%d ", subMatrix[i][j]);
           			 }
            			System.out.println();
        		}
    		}
	}
