import java.util.Scanner;

public class TwoDRightDiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Input the size of the square matrix: ");
        int size = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[size][size];

        // Input elements for the matrix
        System.out.println("Input elements in the matrix:");
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                System.out.printf("element - [%d],[%d] : ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The matrix is:");
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate sum of right diagonal (bottom-left to top-right diagonal)
        int rightDiagonalSum = 0;
        for (int i=0; i<size; i++) {
            rightDiagonalSum += matrix[i][size - i - 1];
        }

        // Display the result
        System.out.println("Addition of the right diagonal elements is: " + rightDiagonalSum);
    }
}
