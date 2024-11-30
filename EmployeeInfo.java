import java.util.*;
class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id ;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
}

public class EmployeeInfo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		System.out.println("Enter the id of employee");
		int id=sc.nextInt();
		sc.nextLine();
		e.setId(id);
		
		System.out.println("Enter name of employee");
		String name=sc.nextLine();
		e.setName(name);
		
		System.out.println("Enter salary of employee");
		double salary=sc.nextDouble();
		e.setSalary(salary);
		
		System.out.println("Employee details as folllows");
		System.out.println("id is: "+e.getId());
		System.out.println("name is: "+e.getName());
		System.out.println("Salary is: "+e.getSalary());
	}
}