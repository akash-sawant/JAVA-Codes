/*1. Create a Product POJO with fields: productId, name, price, quantity, and category.
• Task:
1. Initialize details for 5 products using a constructor.
2. Add methods to:
▪ Update the stock (add or reduce quantity).
▪ Display products in a specific category.
▪ Find the product with the highest stock and display its details.*/

import java.util.Scanner;

class Product {
    private int Pid;
    private String Pname;
    private double Pprice;
    private int Pquantity;
    private String Pcategory;

    // Constructor to initialize product details
    public Product(int Pid, String Pname, double Pprice, int Pquantity, String Pcategory) {
        this.Pid = Pid;
        this.Pname = Pname;
        this.Pprice = Pprice;
        this.Pquantity = Pquantity;
        this.Pcategory = Pcategory;
    }

    // Getter methods
    public int getPid() {
        return Pid;
    }

    public String getPname() {
        return Pname;
    }

    public double getPprice() {
        return Pprice;
    }

    public int getPquantity() {
        return Pquantity;
    }

    public String getPCategory() {
        return Pcategory;
    }

    // Method to update stock
    public void updateStock(int amount) {
        if (Pquantity + amount < 0) {
            System.out.println("Stock cannot be reduced by " + amount + " units. Not enough stock.");
        } else {
            Pquantity += amount;
            System.out.println("Stock updated: " + Pquantity);
        }
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + Pid);
        System.out.println("Product Name: " + Pname);
        System.out.println("Product Price: " + Pprice);
        System.out.println("Product Quantity: " + Pquantity);
        System.out.println("Product Category: " + Pcategory);
    }
}

public class ProductAppJulyPeper {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Product[] p = new Product[5];  // Array to hold 5 products

        // Initialize 5 products
        for (int i = 0; i < p.length; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");

            System.out.print("Enter Product ID: ");
            int Pid = scn.nextInt();
            scn.nextLine();  // Consume the newline character

            System.out.print("Enter Product Name: ");
            String Pname = scn.nextLine();

            System.out.print("Enter Product Price: ");
            double Pprice = scn.nextDouble();

            System.out.print("Enter Product Quantity: ");
            int Pquantity = scn.nextInt();
            scn.nextLine();  // Consume the newline character

            System.out.print("Enter Product Category: ");
            String Pcategory = scn.nextLine();

            p[i] = new Product(Pid, Pname, Pprice, Pquantity, Pcategory);  // Assign product to array
        }

        // Main menu for interaction
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Update stock");
            System.out.println("2. Display products by category");
            System.out.println("3. Display product with the highest stock");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scn.nextInt();

            switch (choice) {
                case 1: // Update stock
                    System.out.print("Enter Product ID to update: ");
                    int productIDupdate = scn.nextInt();
                    System.out.print("Enter quantity to add/reduce (negative to reduce): ");
                    int quantitychange = scn.nextInt();

                    boolean found = false;
                    for (int i = 0; i < p.length; i++) {
                        if (p[i].getPid() == productIDupdate) {
                            p[i].updateStock(quantitychange);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found!");
                    }
                    break;

                case 2: // Display products by category
                    System.out.print("Enter category to search: ");
                    scn.nextLine();  // Consume newline
                    String searchCategory = scn.nextLine();
                    System.out.println("\nProducts in category: " + searchCategory);

                    boolean categoryFound = false;
                    for (int i = 0; i < p.length; i++) {
                        if (p[i].getPCategory().equalsIgnoreCase(searchCategory)) {
                            p[i].displayDetails();
                            categoryFound = true;
                        }
                    }
                    if (!categoryFound) {
                        System.out.println("No products found in this category.");
                    }
                    break;

                case 3: // Display product with the highest stock
                    Product highestStockProduct = p[0];
                    for (int i = 1; i < p.length; i++) { // Start from 1 since p[0] is assumed as initial max
                        if (p[i].getPquantity() > highestStockProduct.getPquantity()) {
                            highestStockProduct = p[i];
                        }
                    }
                    System.out.println("\nProduct with the highest stock:");
                    highestStockProduct.displayDetails();
                    break;

                case 4: // Exit
                    System.out.println("Exiting the Program.");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
