import java.util.Scanner;

public class TwoDMatMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the rows and columns of the first matrix: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.print("Input the rows and columns of the second matrix: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        // Check if matrix multiplication is possible
        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in first matrix must equal number of rows in second matrix.");
            return;
        }

        // Initialize matrices
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] result = new int[row1][col2];

        // Input elements for the first matrix
        System.out.println("Input elements in the first matrix:");
        for (int i=0; i<row1; i++) {
            for (int j=0; j<col1; j++) {
                System.out.printf("element - [%d],[%d] : ", i, j);
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Input elements in the second matrix:");
        for (int i=0; i<row2; i++) {
            for (int j=0; j<col2; j++) {
                System.out.printf("element - [%d],[%d] : ", i, j);
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Display the first matrix
        System.out.println("The First matrix is:");
        for (int i=0; i<row1; i++) {
            for (int j=0; j<col1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // Display the second matrix
        System.out.println("The Second matrix is:");
        for (int i=0; i<row2; i++) {
            for (int j=0; j<col2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplying two matrices
        for (int i=0; i<row1; i++) {
            for (int j=0; j<col2; j++) {
                result[i][j] = 0;
                for (int k=0; k<col1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result of matrix multiplication
        System.out.println("The multiplication of the two matrices is:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
