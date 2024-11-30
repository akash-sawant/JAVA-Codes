/*Q1. WAP to create class name as Per with method void setMarks(int marks[]) and we have three two child class name as Nine and Ten with
 method void showNinePer() this method can display the ninth class percentage and 
 void showTenPer() this method can display the tenth class percentage and every class has six subjects but your task is 
 you have to override setMarks(int marks[]) in Ten class and calculate percentage by using best five rules and display it.
*/
import java.util.Scanner;

class Per {
    int marks[];

    void setMarks(int marks[]) {
        this.marks = marks;
    }
}

class Nine extends Per {
    void showNinePer() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Percentage of six subjects (Class Nine): " + (sum / (float) marks.length));
    }
}

class Ten extends Per {
    void setMarks(int marks[]) {
        this.marks = marks;
    }

    void showTenPer() {
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] < marks[j]) {
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        System.out.println("Percentage of best five subjects (Class Ten): " + (sum / 5.0));
    }
}

public class SubBestMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = 6;
        int marks[] = new int[size];

        System.out.println("Enter marks for six subjects:");
        for (int i = 0; i < size; i++) {
            marks[i] = scn.nextInt();
        }

        Nine n = new Nine();
        n.setMarks(marks);
        n.showNinePer();

        Ten t = new Ten();
        t.setMarks(marks);
        t.showTenPer();

       
    }
}
