import java.util.Scanner;

public class StrongNumberCheckYesOrNo {

    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a Strong number:");
        int num = sc.nextInt();

        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong number: Yes");
        } else {
            System.out.println(num + " is a Strong number: No");
        }
    }
}
