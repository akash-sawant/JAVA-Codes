/* 1  8   27  64   125   216   343  512   729    1000 
print the series */

import java.util.Scanner;
public class ExamSeriesCube {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of series:");
        int n = scn.nextInt();
        System.out.println("Print the Output:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i * i + " ");
        }
       
    }
}
