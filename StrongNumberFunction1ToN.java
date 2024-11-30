import java.util.Scanner;

public class StrongNumberFunction1ToN{
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0, original = number;
        while (number > 0) {
            sum += factorial(number % 10);
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth number:");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
				
            }
        }
	
    }
}
