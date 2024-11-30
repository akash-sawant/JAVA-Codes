/*2. Design a Employee POJO with fields: empId, name, designation, basicSalary, and hra.
• Task:
1. Create a constructor to initialize all fields.
2. Add a method calculateGrossSalary() in the Employee class to calculate the 
gross salary as: grossSalary=basicSalary+hra+basicSalary×0.2(bonus).
3. Write a program to create an array of 5 employees, display their details, and 
calculate gross salary for each employee*/


import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double basicSalary;
    private double hra;

    public Employee(int id, String name, String designation, double basicSalary, double hra) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    public double calculateGrossSalary() {
        return basicSalary + hra + (basicSalary * 0.2);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("Employee HRA: " + hra);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("=======================");
    }
}

public class EmployeeGrossSal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee[] emp = new Employee[2];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter details for Employee:"+(i+1)+":");
            System.out.print("Enter the Employee ID: ");
            int id = scn.nextInt();
            scn.nextLine();
            System.out.print("Enter the Employee Name: ");
            String name = scn.nextLine();
            System.out.print("Enter the Employee Designation: ");
            String designation = scn.nextLine();
            System.out.print("Enter the Employee Basic Salary: ");
            double basicSalary = scn.nextDouble();
            System.out.print("Enter the Employee HRA Salary: ");
            double hra = scn.nextDouble();
            emp[i] = new Employee(id, name, designation, basicSalary, hra);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < emp.length; i++) {
			emp[i].calculateGrossSalary();
            emp[i].displayDetails();
			
        }

        
    }
}