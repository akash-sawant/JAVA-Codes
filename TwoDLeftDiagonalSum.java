import java.util.Scanner;

public class TwoDLeftDiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Input the size of the square matrix: ");
        int size = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[size][size];

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

        // Calculate sum of left diagonal (top-left to bottom-right diagonal)
        int leftDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        // Display the result
        System.out.println("Addition of the left diagonal elements is: " + leftDiagonalSum);
    }
}
