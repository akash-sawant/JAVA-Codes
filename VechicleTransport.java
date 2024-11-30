import java.util.*;
class Vehicle{
	private String model;
	private String rno;
	private int speed;
	private int fcapacity;
	private int fconsum;
	private int time;
	private int distance=0;
	private int fuel=0;
	Vehicle(String model,String rno,int speed,int fcapacity,int fconsum){
		this.model=model;
		this.rno=rno;
		this.speed=speed;
		this.fcapacity=fcapacity;
		this.fconsum=fconsum;
	}
	void distanceCoverd(int time){
		this.time=time;
		distance = speed*time;
	}
	void fuelNeeded(){
		fuel = distance/fconsum;
	}
	void display(){
		System.out.println("-----------------------------------------");
		System.out.println("Vehicle Information -");
		System.out.println("Model: "+model);
		System.out.println("Registration Number: "+rno);
		System.out.println("Speed(km/hr): "+speed);
		System.out.println("Fuel Capacity(liters): "+fcapacity);
		System.out.println("Fuel Consumption(km/liter)"+fconsum);
		System.out.println("Time take(hr): "+time);
		System.out.println("Distance Coverd(km): "+distance);
		System.out.println("Total fuel needed(ltr): "+fuel);
	}
}
class Truck extends Vehicle{
	private int cargoWLimit;
	Truck(String model,String rno,int speed,int fcapacity,int fconsum,int cargoWLimit){
		
		super(model,rno,speed,fcapacity,fconsum);
		//System.out.println("Model issssssssssss: "+model);
		this.cargoWLimit=cargoWLimit;
	}
	void display(){
		super.display();
		System.out.println("Cargo weight limit: "+cargoWLimit);
	}
}
class Bus extends Vehicle{
	private int noOfPassengers;
	Bus(String model,String rno,int speed,int fcapacity,int fconsum,int noOfPassengers){
		
		super(model,rno,speed,fcapacity,fconsum);
		this.noOfPassengers=noOfPassengers;
	}
	void display(){
		super.display();
		System.out.println("No. of Passengers: "+noOfPassengers);
	}
}
public class VechicleTransport{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Vehicle Details - \n1.Enter the details about Truck \n2.Enter the details about Bus");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice){
			
		case 1: 
		    sc.nextLine();
			System.out.println("Enter Model: ");
			String model=sc.nextLine();
			
			System.out.println("Enter Registration No.: ");
			String  rno=sc.nextLine();
			System.out.println("Enter speed(km/hr): ");
			int speed = sc.nextInt();
			System.out.println("Enter Fuel capacity(liters): ");
			int fcapacity=sc.nextInt();
			System.out.println("Enter Fuel Consumption(km/liter) ");
			int fconsum=sc.nextInt();
			System.out.println("Enter Time Taken(hr): ");
			int time=sc.nextInt();
			System.out.println("Enter the Truck Cargo  weight limit: ");
			int cargoWLimit=sc.nextInt();
			
			Truck trk=new Truck(model,rno,speed,fcapacity,fconsum,cargoWLimit);
			
			trk.distanceCoverd(time);
			trk.fuelNeeded();
			trk.display();
			
			break;
			
		case 2:
			sc.nextLine();
			System.out.println("Enter Model: ");
			String model2=sc.nextLine();
			
			System.out.println("Enter Registration No.: ");
			String  rno2=sc.nextLine();
			System.out.println("Enter speed(km/hr): ");
			int speed2 = sc.nextInt();
			System.out.println("Enter Fuel capacity(liters): ");
			int fcapacity2=sc.nextInt();
			System.out.println("Enter Fuel Cunsumption(km/liter) ");
			int fconsum2=sc.nextInt();
			System.out.println("Enter Time Taken(hr): ");
			int time2=sc.nextInt();
			System.out.println("Enter the No. of passengers: ");
			int noOfPassengers=sc.nextInt();
			
			Bus bs=new Bus(model2,rno2,speed2,fcapacity2,fconsum2,noOfPassengers);
			
			bs.distanceCoverd(time2);
			bs.fuelNeeded();
			bs.display();
			
			break;
			
		default :
			System.out.println("Wrong choice.");
		}
	}
}
