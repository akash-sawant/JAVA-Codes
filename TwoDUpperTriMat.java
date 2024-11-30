import java.util.Scanner;

public class TwoDUpperTriMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the matrix
        System.out.print("Input the size of the square matrix: ");
        int size = sc.nextInt();
        
        int[][] matrix = new int[size][size];
        
        // Input elements into the matrix
        System.out.println("Input elements in the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Display the original matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Print the upper triangular matrix (set elements below the diagonal to 0)
        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
