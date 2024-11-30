import java.util.Scanner;

class Employee {
    int eId;
    String eName;
    double eSal;
    String eAddress;
    String eContact;

    public Employee(int eId, String eName, double eSal, String eAddress, String eContact) {
        this.eId = eId;
        this.eName = eName;
        this.eSal = eSal;
        this.eAddress = eAddress;
        this.eContact = eContact;
    }

    public void displayDetails() {
        System.out.println("ID: " + eId + ", Name: " + eName + ", Salary: " + eSal 
                           + ", Address: " + eAddress + ", Contact: " + eContact);
    }
}

public class EmployeeManagerJuly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee :");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Contact: ");
            String contact = sc.nextLine();

            employees[i] = new Employee(id, name, salary, address, contact);
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].eName.equals("ram")) {
                employees[i].eSal = 10000;
                System.out.println("Updated salary for employee 'ram' to 10000.");
            }
        }

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].eId > employees[j].eId) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        System.out.println("\nEmployee details after update and sorting by ID:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

    }
}
