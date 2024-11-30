import java.util.Scanner;

public class MergedCharacterApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = scn.nextInt();
        scn.nextLine();
        char[] ch1 = new char[size1];

        System.out.println("Enter characters for the first array:");
        for (int i = 0; i < size1; i++) {
            ch1[i] = scn.nextLine().charAt(0);
        }

        System.out.println("Enter the size of the second array:");
        int size2 = scn.nextInt();
        scn.nextLine();
        char[] ch2 = new char[size2];

        System.out.println("Enter characters for the second array:");
        for (int i = 0; i < size2; i++) {
            ch2[i] = scn.nextLine().charAt(0);
        }

        char[] mergedWord = new char[size1 + size2];
        int index = 0;

        for (int i = 0; i < size1; i++) {
            mergedWord[index++] = ch1[i];
        }

        for (int i = 0; i < size2; i++) {
            mergedWord[index++] = ch2[i];
        }

        System.out.println("Merged characters:");
        for (int i = 0; i < mergedWord.length; i++) {
            System.out.print(mergedWord[i] + " ");
        }
    }
}
