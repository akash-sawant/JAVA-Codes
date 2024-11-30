import java.util.Scanner;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int lastDigit = num % 10;
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;
        
        System.out.println("Sum of first and last digit: " + (firstDigit + lastDigit));
        
	}
}
