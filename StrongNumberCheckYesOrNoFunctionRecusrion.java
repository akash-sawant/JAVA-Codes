import java.util.Scanner;

public class StrongNumberCheckYesOrNoFunctionRecusrion {

    public static int factorial(int digit) {
        if (digit <= 1) {
            return 1;
        }
        return digit * factorial(digit - 1);
    }

    public static boolean isStrongNumber(int num, int sum) {
        if (num == 0) {
            return sum == 0;
        }
        int digit = num % 10;
        sum += factorial(digit);
        return isStrongNumber(num / 10, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a Strong number:");
        int num = sc.nextInt();

        if (isStrongNumber(num, 0)) {
            System.out.println(num + " is a Strong number: Yes");
        } else {
            System.out.println(num + " is a Strong number: No");
        }
    }
}
