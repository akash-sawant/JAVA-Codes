import java.util.*;

class OccurencesFunctionRec {

    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int i = 0;
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Occurrences of elements:");
        findOccurrence(arr, 0, 1, 1);
    }

    public static void findOccurrence(int[] arr, int idx, int curr, int count) {
        if (idx >= arr.length) {
            return;
        }

        if (arr[idx] == -1) {
            findOccurrence(arr, idx + 1, idx + 2, 1);
            return;
        }

        if (curr >= arr.length) {
            System.out.println(arr[idx] + "  " + count);
            findOccurrence(arr, idx + 1, idx + 2, 1);
            return;
        }

        if (arr[idx] == arr[curr]) {
            count++;
            arr[curr] = -1;
        }

        findOccurrence(arr, idx, curr + 1, count);
    }
}
