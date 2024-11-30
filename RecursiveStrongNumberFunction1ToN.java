import java.util.Scanner;

public class RecursionStrongNumberFunction1ToN {

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

    public static void printStrongNumbers(int current, int limit) {
        if (current > limit) {
            return;
        }
        if (isStrongNumber(current)) {
            System.out.print(current + " ");
        }
        printStrongNumbers(current + 1, limit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number:");
        int N = sc.nextInt();

        printStrongNumbers(1, N);
    }
}
