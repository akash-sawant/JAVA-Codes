

import java.util.Scanner;

public class MajorityOfGivennumber1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("enter the value of array");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();

        }
        int m,n,c=0;
        System.out.println("enter the number to check majority");
        n=sc.nextInt();
        m=a.length/2;
        for (int i = 0; i < a.length; i++) {
            if (n==a[i]) {
                c++;
            }
        }
        if (c>m) {
            System.out.println("majority is greater "+n+" than "+m);

        }
        else{
        System.out.println("majority is no greter");
        }
        sc.close();
    }
}
