import java.util.Scanner;

interface Payable {
    double calculateSalary();
}

class FullTimeEmployee implements Payable {
    private String name;
    private double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }
}

class PartTimeEmployee implements Payable {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public String getName() {
        return name;
    }
}

public class InterfacePayable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Full-Time Employee Details:");
        System.out.print("Enter the Name: ");
        String fullTimeName = scn.nextLine();

        System.out.print("Enter the Salary: ");
        double fullTimeSalary = scn.nextDouble();
        scn.nextLine(); 

        Payable fullTimeEmployee = new FullTimeEmployee(fullTimeName, fullTimeSalary);

        System.out.println("\nEnter the Part-Time Employee Details:");
        System.out.print("Enter the Name: ");
        String partTimeName = scn.nextLine();

        System.out.print("Enter the Hourly Rate: ");
        double hourlyRate = scn.nextDouble();

        System.out.print("Enter the Hours Worked: ");
        int hoursWorked = scn.nextInt();

        Payable partTimeEmployee = new PartTimeEmployee(partTimeName, hourlyRate, hoursWorked);

        System.out.println("\nFull-Time Employee Salary:");
        System.out.println("Name: " + fullTimeName + ", Salary: $" + fullTimeEmployee.calculateSalary());

        System.out.println("\nPart-Time Employee Salary:");
        System.out.println("Name: " + partTimeName + ", Salary: $" + partTimeEmployee.calculateSalary());

    }
}
