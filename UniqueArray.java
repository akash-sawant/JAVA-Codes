import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = scn.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        System.out.println("Unique Elements:");
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
