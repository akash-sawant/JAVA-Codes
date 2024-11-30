/*Write an abstract class Appliance with: 
Attributes: String brand, double power;
Constructor: Initialize brand and power. 
Abstract Method: 
abstract void turnOn() - This method should print a message indicating that the 
appliance is turned on. 
 Create a concrete subclass WashingMachine with: 
Additional attribute int capacity. A constructor to initialize brand, power, and 
capacity.
Implementation of turnOn() to print a message about starting the washing machine 
with the specific capacity. 
In the main method, create an instance of WashingMachine and call the turnOn() 
method*/

import java.util.Scanner;
abstract class Appliance{
	String brand;
	double poewr;
}
  Appliance(String brand, double power){
	this.brand=brand;
	this.power=power;
}
abstract void turnOn(){

}

class washingMachine extends Appliance{
	int capacity;
	washingMachine(String brand,double power,int capacity){
		super(brand,power);
		this.capacity=capacity;
	}
	void trunOn(){
		if(capacity<50){
			System.out.println("Staring the Washing machine:");
		}
		else{
			System.out.println("Washing machine is overload:");
		}
	}
	
}
public class WashingMachineApp{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Name Of Brand:");
		String brand=scn.nextLine();
		
		System.out.println("Enter the Power:");
		double power=scn.nextDouble();
		
		System.out.println("Enter the Capacity of washingMachine");
		int capacity=scn.nextInt();
		
		washingMachine wm =new washingMachine(brand,power,capacity);
		vm.turnOn();
	}
}
}