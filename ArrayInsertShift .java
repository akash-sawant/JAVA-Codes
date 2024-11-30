import java.util.*;

public class ArrayInsertShift 
{
    public static void main(String x[]) 
     {
        Scanner sc=new Scanner(System.in);
        int a[] = new int[6];
        System.out.println("Initial array values:");
        for (int i = 0; i < a.length; i++) 
        {
           a[i]=sc.nextInt();  
        }
       System.out.printf("%d\t", a[i]);
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = value;
        System.out.println("Array after insertion:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t", a[i]);
        }
        System.out.println();
    }
}
