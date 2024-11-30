/*Write a java program to create a class name as Employee using pojo class to accept id, 
name, email, sal and create method name as getFunction() to implement the logic.
Note : - Display Second Highest Salary Employee Recor*/

import java.util.Scanner;
class 
{
	private int id;
	private String name;
	private int email;
	private int sal;
	
	public Employee(int id,String name,int email,int sal){
		this.id=id;
		this.name=name;
		this.email.email;
		this.sal=sal;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(int email){
		this.email=email;
	}
	public int getEmail(){
		return email;
	}
	public void setSal(int sal){
		this.sal=sal;
	}
	public int getSal(){
		return sal;
	}
	public void getFunction(){
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Email:"+email);
		System.out.println("Employees Sal:"+sal);
	}
}
public class EmployeeSecondHighSal{
	
}