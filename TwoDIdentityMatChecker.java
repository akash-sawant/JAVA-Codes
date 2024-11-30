
import java.util.Scanner;

public class TwoDIdentityMatChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of rows and columns for the matrix
        System.out.print("Input number of Rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Input number of Columns for the matrix: ");
        int cols = sc.nextInt();

        // Check if the matrix is square (required for an identity matrix)
        if (rows != cols) {
            System.out.println("The matrix is not square, so it cannot be an identity matrix.");
            return;
        }

        // Declare the matrix
        int[][] matrix = new int[rows][cols];

        // Input the elements of the matrix
        System.out.println("Input elements in the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Check if the matrix is an identity matrix
        boolean flag= true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1) { // Diagonal elements must be 1
                    flag = false;
                    break;
                } else if (i != j && matrix[i][j] != 0) { // Non-diagonal elements must be 0
                    flag= false;
                    break;
                }
            }
        }

        // Output result
        if (flag) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }
    }
}
