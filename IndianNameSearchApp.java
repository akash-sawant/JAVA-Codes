
import java.util.Scanner;

class StringApp {
    char[] charArray;

    StringApp(char[] charArray) {
        this.charArray = charArray;
    }

    public void findChar(char searchValue) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchValue) {
                if (i > 0) {
                    System.out.println(charArray[i - 1]);
                }
                if (i < charArray.length - 1) {
                    System.out.println(charArray[i + 1]);
                }
            }
        }
    }
}

public class IndianNameSearchApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of the character array:");
        int size = scn.nextInt();
        char[] ch = new char[size];

        System.out.println("Enter the characters:");
        for (int i = 0; i < size; i++) {
            ch[i] = scn.next().charAt(0);
        }

        System.out.println("Enter the character to search:");
        char searchValue = scn.next().charAt(0);
		
		

        StringApp sp = new StringApp(ch);
        sp.findChar(searchValue);

        
    }
}
