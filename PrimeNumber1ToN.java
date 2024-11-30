import java.util.Scanner;

class PrimeNumber1ToN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int n = scn.nextInt();
        
        System.out.println("Prime numbers from 1 to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            // Check divisibility from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            
            // Print prime number
            if (flag) {
                System.out.println(i);
            }
        }
        
    }
}
