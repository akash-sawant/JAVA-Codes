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

abstract class Appliance {
    String brand;
    double power;

    Appliance(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }

    abstract void turnOn();
}

class WashingMachine extends Appliance {
    int capacity;

    WashingMachine(String brand, double power, int capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    void turnOn() {
        if (capacity < 50) {
            System.out.println("Starting the Washing machine with capacity " + capacity + " kg.");
        } else {
            System.out.println("Washing machine is overloaded.");
        }
    }
}

public class WashingMachineApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Name of the Brand:");
        String brand = scn.nextLine();
        System.out.println("Enter the Power:");
        double power = scn.nextDouble();
        System.out.println("Enter the Capacity of the Washing Machine:");
        int capacity = scn.nextInt();
        WashingMachine wm = new WashingMachine(brand, power, capacity);
        wm.turnOn();
    }
}
