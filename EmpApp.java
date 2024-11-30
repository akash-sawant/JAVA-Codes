/* Q4. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object*/

import java.util.*;

class Employee
{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
} 

public class EmpApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee name");
		String name=sc.nextLine();
		
		System.out.println("Enter the salary of employee");
		int sal=sc.nextInt();
		
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSal(sal);
		
		System.out.println("-----------------------------");
		System.out.println("Employee details as follows :");
		System.out.println("Employee id is :"+emp.getId());
		System.out.println("Employee name is :"+emp.getName());
		System.out.println("Employee salary is :"+emp.getSal());
		
	}
}