import java.util.Scanner;

public class StrongNumber1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number:");
        int N = sc.nextInt();

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
            }

            num = original;
        }
    }
}
