import java.util.*;
public class IdentityMatrix
{
    public static void main(String x[])
     {
	Scanner sc=new Scanner(System.in);
	System.out.print("Input number of Rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Input number of Columns for the matrix: ");
        int columns = sc.nextInt();

	if (rows != columns) 
       {
         System.out.println("The matrix must be square to be an identity matrix.");
            return;
        }
	int[][] matrix=new int[rows][columns];
	System.out.println("Input elements in the matrix:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }

	System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       
        if (int isIdentityMatrix(matrix, rows)) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }

     }
}