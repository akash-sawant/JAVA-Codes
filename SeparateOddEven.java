import java.util.Scanner;

public class SeparateOddEven 
    {
        public static void main(String[] args) 
       {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input the number of elements in array: ");
         int n = sc.nextInt();
         arr[i] = new int[];
         int a[] = new int[n];      // Original array
         int even[] = new int[n];     // Array to store even numbers
         int odd[] = new int[n];      // Array to store odd numbers
         int j=0,k=0;

         System.out.println("Input" + n + "elements in the array:");
         for(int i=0; i<n; i++) {
         System.out.print("element - " + i + ":");
         arr[i] = sc.nextInt();

            if (arr[i]%2 == 0) {
                even[j] = arr[i];
                j++;
            } else {
                odd[k] = arr[i];
                k++;
            }
        }

        System.out.println("\nThe Even elements are:");
        for (int i = 0; i < j; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\nThe Odd elements are:");
        for (int i = 0; i < k; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
