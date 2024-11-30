import java.util.Scanner;

public class TwoDMatrixSumRowsColumns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Input the size of the square matrix: ");
        int size = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[size][size];
        int[] rowSum = new int[size];
        int[] colSum = new int[size];

        // Input elements for the matrix
        System.out.println("Input elements in the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("element - [%d],[%d] : ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate sum of each row and column
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rowSum[i] += matrix[i][j]; // Sum of rows
                colSum[j] += matrix[i][j]; // Sum of columns
            }
        }

        // Display the sum of rows and columns
        System.out.println("The sum of rows and columns of the matrix is:");

        // Print the matrix along with row sums
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(rowSum[i]);  // Print row sum after each row
        }

        // Print column sums
        for (int j = 0; j < size; j++) {
            System.out.print(colSum[j] + " ");
        }
        System.out.println();
    }
}

