/*Q4. Create a base class Employee with fields empId, name, and salary.
Create a subclass Manager with an additional field bonus.
Create another subclass Intern with an additional field internshipDuration.
• Implement parameterized constructors.
• Write a method calculateFinalSalary() in each class to calculate the salary:
o For Employee, return salary.
o For Manager, add bonus to salary.
o For Intern, divide salary by the internship duration in months.
• Use an array to store employee data for all types, and implement a method to 
display the final salary of each employee.*/

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateFinalSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Final Salary: " + calculateFinalSalary());
    }
}

class Manager extends Employee {
    double bonus;

    Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateFinalSalary() {
        return salary + bonus;
    }

    @Override
    public void display() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Final Salary: " + calculateFinalSalary());
    }
}

class Intern extends Employee {
    int internshipDuration;

    Intern(int id, String name, double salary, int internshipDuration) {
        super(id, name, salary);
        this.internshipDuration = internshipDuration;
    }
	
    double calculateFinalSalary() {
        return salary / internshipDuration;
    }

    @Override
    public void display() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Final Salary: " + calculateFinalSalary());
    }
}

public class EmployeeInternshipApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number of Employees:");
        int n = scn.nextInt();
        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details of Employee:");
            System.out.println("Enter type: 1. Employee 2. Manager 3. Intern:");
            int type = scn.nextInt();

            System.out.println("Enter the Employee Id:");
            int id = scn.nextInt();

            System.out.println("Enter the Name:");
            scn.nextLine();
            String name = scn.nextLine();

            System.out.println("Enter the Salary:");
            double salary = scn.nextDouble();

            if (type == 1) {
                emp[i] = new Employee(id, name, salary);
            } else if (type == 2) {
                System.out.println("Enter the Bonus:");
                double bonus = scn.nextDouble();
                emp[i] = new Manager(id, name, salary, bonus);
            } else if (type == 3) {
                System.out.println("Enter the Internship Duration (in months):");
                int duration = scn.nextInt();
                emp[i] = new Intern(id, name, salary, duration);
            } else {
                System.out.println("Invalid type. Skipping this entry.");
                emp[i] = new Employee(0, "Unknown", 0); // Placeholder entry
            }
        }

        System.out.println("Final Salary Details of Employees:");
        for (int i = 0; i < emp.length; i++) {
            emp[i].display();
            System.out.println("==================");
        }

    }
}
