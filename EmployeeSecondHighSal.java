/*Write a java program to create a class name as Employee using pojo class to accept id, 
name, email, sal and create method name as getFunction() to implement the logic.
Note : - Display Second Highest Salary Employee Recor*/

import java.util.Scanner;
class Employee
{
	private int id;
	private String name;
	private String email;
	private int sal;
	
	public Employee(int id,String name,String email,int sal){
		this.id=id;
		this.name=name;
		this.email=email;
		this.sal=sal;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public int getSal(){
		return sal;
	}
}
class CheckSecondHghestSalary{
	Employee emp[];
	void setEmployee(Employee emp[])
	{
		this.emp=emp;
	}
	void getFunction(){
		Employee max=emp[0];
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i;j<emp.length;j++)
			{
				if(emp[i].getSal()<emp[j].getSal())
				{
					max=emp[j];
				}
			}
		}
		
		System.out.println("max salary: "+max.getSal());
		
		Employee min=emp[0];
		
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i;j<emp.length;j++)
			{
				if(emp[i].getSal()>emp[j].getSal())
				{
					min=emp[j];
				
				}
			}
		}
		
		System.out.println("min salary: "+min.getSal());
		
		Employee secondhighest=emp[0];
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getSal()>secondhighest.getSal() && emp[i].getSal()<max.getSal())
			{
				secondhighest=emp[i];
			}
		}
		System.out.println("Id "+secondhighest.getId()+"\tName "+secondhighest.getName()+"\tSalary "+secondhighest.getSal()+"\tEmail "+secondhighest.getEmail());
	}
	
}

public class EmployeeSecondHighSal{
		public static void main(String[]args){
			Scanner scn=new Scanner(System.in);
			
			System.out.println("Enter total employee?\t");
			int total=scn.nextInt();
			Employee emp[]=new Employee[total];
			
			System.out.println("Enter the all Employee Details:");
			for(int i=0;i<emp.length;i++)
			{
				System.out.println("Enter the id:");
				int id=scn.nextInt();
			
				System.out.println("Enter the Name:");
				scn.nextLine();
				String name=scn.nextLine();
			
				System.out.println("Enter email:");
				String email=scn.nextLine();
			
				System.out.println("Enter Salary:");
				int sal=scn.nextInt();
			
				emp[i]=new Employee(id,name,email,sal);
			}
			CheckSecondHghestSalary chs=new CheckSecondHghestSalary();
				chs.setEmployee(emp);
				chs.getFunction();
			
		}
}