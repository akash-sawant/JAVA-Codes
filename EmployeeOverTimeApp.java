/*/*Write a java Program to calculate overtime pay of 5 employees. 
The overtime pay rate is Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
Note- for a week only 40 hours of working are allowed.
1. Create class Employee with data member ID, Name, total working, salary, overtime Set Information by using a setDetails() method and create a display Information() method to display all information with salary.
2. Create another class name as OverTime with method setEmployee(Employee emp[]) and void calculateOvertime() to calculate overtime.*/ 
*/
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
    int totalworkinghours;
    double overtimepay;

    public void setInformation(int id, String name, double salary, int totalworkinghours) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.totalworkinghours = totalworkinghours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getTotalWorkingHours() {
        return totalworkinghours;
    }

    void displayInformation() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Total Working Hours: " + totalworkinghours);
        System.out.println("Employee OverTime Pay: " + overtimepay);
		System.out.println("=======================");
    }
}

class OverTimeApp {
    Employee[] emp;

    void setEmployee(Employee[] emp) {
        this.emp = emp;
    }

    void calculateOvertime() {
        for (int i = 0; i < emp.length; i++) {
            int otime = emp[i].getTotalWorkingHours() - 40;
            if (otime > 0) {
                emp[i].overtimepay = otime * 50;
                emp[i].salary += otime * 50;
            }
        }
    }

    void displayEmployees() {
        for(int i=0;i<emp.length;i++)
		{
			System.out.println("Id:"+emp[i].id);//101
			System.out.println("Name:"+emp[i].name);//Ajay
			System.out.println("Salary:"+emp[i].salary);//3300
			System.out.println("Total working hours:"+emp[i].totalworkinghours);//56
			System.out.println("Over time pay:"+emp[i].overtimepay);//800
			System.out.println("=======================");
		}
    }
}

public class EmployeeOverTimeApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scn.nextInt();
        scn.nextLine(); 

        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("Enter details for Employee:");
            System.out.print("ID: ");
            int id = scn.nextInt();
            scn.nextLine(); 
			
            System.out.print("Name: ");
            String name = scn.nextLine();
			
            System.out.print("Salary: ");
            double salary = scn.nextDouble();
			
            System.out.print("Total Working Hours: ");
            int totalworkinghours = scn.nextInt();
            scn.nextLine(); 

            emp[i].setInformation(id, name, salary, totalworkinghours);
        }

        OverTimeApp ot = new OverTimeApp();
        ot.setEmployee(emp);
        ot.calculateOvertime();
        System.out.println("Employee Details with Overtime Pay:");
        ot.displayEmployees();
    }
}
