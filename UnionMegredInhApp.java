/*Q2. WAP to create class name as TestArr with method
void acceptArray(int a[],int b[]) : this method can accept array as parameter
we have three child classes name as Union with method
void findUnionOfArray():this method can find the union of two array and display
and we have one more child name as Intersection with method
void findInetersection() this method can find the intersection of array and display it and we have third MergeArray with method
void mergeArray(): this method can merge two array and display it.
 
*/
import java.util.Scanner;

class TestArr {
    int a[];
    int b[];

    void acceptArray(int a[], int b[]) {
        this.a = a;
        this.b = b;
    }
}

class Union extends TestArr {
    void findUnionOfArray() {
        int unionArr[] = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            unionArr[k++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                unionArr[k++] = b[i];
            }
        }

        System.out.println("Union of arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(unionArr[i] + " ");
        }
        System.out.println();
    }
}

class Intersection extends TestArr {
    void findIntersection() {
        System.out.println("Intersection of arrays:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}

class MergeArray extends TestArr {
    void mergeArray() {
        int c[] = new int[a.length + b.length];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            c[j++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[j++] = b[i];
        }

        System.out.println("Merged array:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}

public class UnionMergedInhApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a1[] = new int[5];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int a2[] = new int[5];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        Union u = new Union();
        u.acceptArray(a1, a2);
        u.findUnionOfArray();

        Intersection i = new Intersection();
        i.acceptArray(a1, a2);
        i.findIntersection();

        MergeArray ma = new MergeArray();
        ma.acceptArray(a1, a2);
        ma.mergeArray();

        
    }
}
