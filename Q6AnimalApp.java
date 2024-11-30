import java.util.Scanner;
abstract class Animal{
	abstract void makeSound();
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("Dog Says is :woof woof");
	}
}
class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat says is:mau mau");
	}
}
public class Q6AnimalApp{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.println("choose animal is(1.dog,2.cat):");
		int choice= scn.nextInt();
		
		Animal animal;
        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        animal.makeSound();
	}
}