import java.util.Scanner;

public class RecursionSumStrongNumberFunction1ToN {

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static boolean isStrongNumber(int number) {
        return checkStrong(number, 0, number);
    }

    private static boolean checkStrong(int num, int sum, int original) {
        if (num == 0) {
            return sum == original;
        }
        return checkStrong(num / 10, sum + factorial(num % 10), original);
    }

    public static int sumStrongNumbers(int current, int limit, int sum) {
        if (current > limit) {
            return sum;
        }
        if (isStrongNumber(current)) {
            System.out.print(current + " ");  // Print each strong number
            sum += current;
        }
        return sumStrongNumbers(current + 1, limit, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number:");
        int N = sc.nextInt();

        int totalSum = sumStrongNumbers(1, N, 0);
        System.out.println("\nSum of Strong numbers from 1 to " + N + ": " + totalSum);
    }
}
