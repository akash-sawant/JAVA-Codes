import java.util.Scanner;

class ArrayCons {
    ArrayCons(int[] a) {
        System.out.println("Array elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    ArrayCons(int[] a, int[] b) {
        if (isAnagram(a, b)) {
            System.out.println("The arrays are anagrams.");
        } else {
            System.out.println("The arrays are not anagrams.");
        }
    }

    private boolean isAnagram(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        manualSort(a);
        manualSort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private void manualSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class AnagaramArrayYesNOCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println("\nTesting single array constructor:");
        new ArrayCons(array1);

        System.out.println("\nTesting anagram check with two arrays:");
        new ArrayCons(array1, array2);
    }
}
