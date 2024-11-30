import java.util.Scanner;

class Medical {
    int id;
    String name;
    double price;
    String ptype;
    int tabletInStrips;
    String expireDate;
    int quantity;

    public Medical(int pid, String pname, double price, String ptype, int tabletInStrips, String expireDate, int quantity) {
        this.id = pid;
        this.name = pname;
        this.price = price;
        this.ptype = ptype;
        this.tabletInStrips = tabletInStrips;
        this.expireDate = expireDate;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Type: " + ptype);
        System.out.println("Tablets in Strips: " + tabletInStrips);
        System.out.println("Expiry Date: " + expireDate);
        System.out.println("Quantity: " + quantity);
    }

    public double priceWithGST() {
        return price + (price * 0.18);
    }
}

public class MedicalStoreBillWithGST {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Medical[] m = new Medical[3];

        System.out.println("Enter the details of Medical products:");
        for (int i = 0; i < m.length; i++) {
            System.out.println("\nEnter the details for Product:");

            System.out.print("Enter Product ID: ");
            int id = scn.nextInt();
            scn.nextLine();

            System.out.print("Enter Product Name: ");
            String name = scn.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scn.nextDouble();
            scn.nextLine();

            System.out.print("Enter Product Type: ");
            String ptype = scn.nextLine();

            System.out.print("Enter Tablets in Strips: ");
            int tabletInStrips = scn.nextInt();
            scn.nextLine();

            System.out.print("Enter Expiry Date DD/MM/YYYY):");
            String expireDate = scn.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = scn.nextInt();

            m[i] = new Medical(id, name, price, ptype, tabletInStrips, expireDate, quantity);
        }

        System.out.println("\nAll Medical Products Details:");
        for (int i = 0; i < m.length; i++) {
            m[i].displayProduct();
            System.out.println("=======================");
        }

        System.out.println("\nProducts with 18% GST Included:");
        for (int i = 0; i < m.length; i++) {
            System.out.println("Product Name: " + m[i].name);
            System.out.println("Price with GST: " + m[i].priceWithGST());
            System.out.println("=======================");
        }

        System.out.println("\nProducts with Price > 100 and < 1000:");
        for (int i = 0; i < m.length; i++) {
            if (m[i].price > 100 && m[i].price < 1000) {
                m[i].displayProduct();
                System.out.println("=======================");
            }
        }

     
    }
}
