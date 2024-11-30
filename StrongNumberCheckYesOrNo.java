import java.util.Scanner;

public class StrongNumberCheckYesOrNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a Strong number:");
        int num = sc.nextInt();

        int sum = 0;
        int original = num;
        int tempNum = num;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            tempNum /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number: Yes");
        } else {
            System.out.println(original + " is a Strong number: No");
        }
    }
}
