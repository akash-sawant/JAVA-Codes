import java.util.Scanner;

public class ReverseCharApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of characters:");
        int size = scn.nextInt();
        scn.nextLine(); 

        char ch[] = new char[size];

        System.out.println("Enter the characters:");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = scn.nextLine().charAt(0);
        }

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed characters:");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}
