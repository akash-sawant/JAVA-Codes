import java.util.Scanner;

public class StrongNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number:");
        int N = sc.nextInt();

        int totalSum = 0;  
        System.out.println("Strong numbers from 1 to " + N + " are:");

        for (int num = 1; num <= N; num++) {
            int sum = 0;
            int original = num;
            while (num > 0) {
                int digit = num % 10;
                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }
                sum += fact;
                num /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
                totalSum += original;  // Add the Strong number to the total sum
            }

            num = original; // Reset num after checking
        }

        // Print the sum of Strong numbers
        System.out.println("\nThe sum of Strong numbers from 1 to " + N + " is: " + totalSum);
    }
}
