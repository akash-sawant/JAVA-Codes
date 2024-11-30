import java.util.Scanner;

public class OccurencesElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Size:");
        int size = scn.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the Numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Number occurrences:");
        int count = 1;
        int maxCount = 0;
        int maxNo = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] == a[i + 1]) {
                count++;
            } else {
                System.out.println(a[i] + " ====== " + count);
                if (count > maxCount) {
                    maxCount = count;
                    maxNo = a[i];
                }
                count = 1;
            }
        }

        System.out.println("Number with the highest count: " + maxNo + " ====== " + maxCount);
    }
}
