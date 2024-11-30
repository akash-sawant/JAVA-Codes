abstract class Pattern {
    abstract void display();
}

class First extends Pattern {
    void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + (j > 1 ? " # " : ""));
            }
            System.out.println();
        }
    }
}

class Second extends Pattern {
    void display() {
        char small = 'a', capital = 'A';
        for (int i = 1; i <= 4; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print((char)(small + j) + " ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print((char)(capital + j) + " ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print((char)(small + i) + " ");
        }
        System.out.println();
    }
}

public class AbstractPatternApp {
    public static void main(String[] args) {
        Pattern pattern1 = new First();
        System.out.println("Pattern from First:");
        pattern1.display();

        Pattern pattern2 = new Second();
        System.out.println("\nPattern from Second:");
        pattern2.display();
    }
}
