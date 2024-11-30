import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        if (salary >= 100000) {
            return salary * 0.15;
        } else if (salary >= 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.05; 
        }
    }

    void displayEmployeeDetails() {
        double bonus = calculateBonus();
        double totalCompensation = salary + bonus;

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Calculated Bonus: " + bonus);
        System.out.println("Total Compensation: " + totalCompensation);
    }
}

public class EmployeeBonusSal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Employee ID: ");
        int id = scn.nextInt();
        scn.nextLine();

        System.out.print("Enter the Employee Name: ");
        String name = scn.nextLine();

        System.out.print("Enter the Employee Salary: ");
        double salary = scn.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.displayEmployeeDetails();

       
    }
}
