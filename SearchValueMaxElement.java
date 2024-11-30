import java.util.Scanner;

class ArrayCons {
    int a[];
    int value;

    public ArrayCons(int a[], int value) {
        this.a = a;
        this.value = value;
        searchValueArray();
    }

    public ArrayCons(int a[]) {
        this.a = a;
        findMaxValue();
    }

    public void searchValueArray() {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Present value in array: " + value);
        } else {
            System.out.println("Value not present in array: " + value);
        }
    }

    public void findMaxValue() {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}

public class SearchValueMaxElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scn.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scn.nextInt();
        }

        System.out.println("Enter the value to search in the array:");
        int searchValue = scn.nextInt();

        ArrayCons ac1 = new ArrayCons(a, searchValue);

        ArrayCons ac2 = new ArrayCons(a);
    }
}
