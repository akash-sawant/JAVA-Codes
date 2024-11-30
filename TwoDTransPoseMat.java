import java.util.Scanner;

public class TwoDTransPoseMat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Input the rows and columns of the matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Input elements for the matrix
        System.out.println("Input elements in the matrix:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.printf("element - [%d],[%d] : ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The matrix is:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of the matrix
        int[][] transpose = new int[cols][rows];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the transpose of the matrix
        System.out.println("The transpose of the matrix is:");
        for (int i=0; i<cols; i++) {
            for (int j=0; j<rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
