import java.util.Scanner;
public class OccurencesElement{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Size:");
        int size = scn.nextInt();
        char[] ch = new char[size];

        System.out.println("Enter the Characters:");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = scn.next().charAt(0);
        }

        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] < ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        System.out.println("Character occurrences:");
        int count = 1;
        int maxCount = 0;
        char maxChar = '\0';

        for (int i = 0; i < ch.length; i++) {
            if (i < ch.length - 1 && ch[i] == ch[i + 1]) {
                count++;
            } else {
                System.out.println(ch[i] + " ====== " + count);
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = ch[i];
                }
                count = 1;
            }
        }

        System.out.println("Character with the highest count: " + maxChar + " ====== " + maxCount);
    }
}





