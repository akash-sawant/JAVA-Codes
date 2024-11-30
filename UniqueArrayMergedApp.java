import java.util.Scanner;

class ArrayOperation {
    int a[];

    public void setArray(int a[]) {
        this.a = a;
    }
}

class Unique extends ArrayOperation {
    public void FindUnique() {
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}

class MergeArray extends ArrayOperation {
    public void FindMergedArray(int[] a,int[] b) {
        int c[] = new int[a.length + b.length];
	    int j = 0;
        System.out.println("After merging arrays:");
        for (int i = 0; i < a.length; i++) {
           c[j] = a[i];
		   j++;
		 }
		for (int i = 0; i < b.length; i++) {
           c[j] = b[i];
		   j++;
		 }
		for (int i = 0; i < c.length; i++) {
           System.out.println(c[i]);
		 }
        System.out.println();
    }
}

public class UniqueArrayMergedApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Unique u = new Unique();
        System.out.println("Enter the size of elements for Unique array:");
        int size = scn.nextInt();
        int[] result = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            result[i] = scn.nextInt();
        }

        u.setArray(result);
        u.FindUnique();

   
        MergeArray ma = new MergeArray();
        System.out.println("Enter the size of the first array:");
        int size1 = scn.nextInt();
        int[] result1 = new int[size1];

        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < size1; i++) {
            result1[i] = scn.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int size2 = scn.nextInt();
        int[] result2 = new int[size2];

        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < size2; i++) {
            result2[i] = scn.nextInt();
        }

        ma.setArray(result);
        ma.FindMergedArray(result1,result2);
    }
}
