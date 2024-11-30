import java.util.Scanner;

abstract class Value {
    int a, b;

    void setValue(int x, int y) {
        a = x;
        b = y;
    }

    abstract int performCalculation();
}

class Add extends Value {
    int performCalculation() {
        return a + b;
    }
}

class Multiplication extends Value {
    int performCalculation() {
        return a * b;
    }
}

class Divide extends Value {
    int performCalculation() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
}

class Sub extends Value {
    int performCalculation() {
        return a - b;
    }
}

class Calculator {
    void performCalculation(Value v) {
        System.out.println("Result is: " + v.performCalculation());
    }
}

public class Q8LosseCouplingCal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calculator c = new Calculator();

        Value operation = null;

        System.out.println("Enter the two numbers:");
        int x = scn.nextInt();
        int y = scn.nextInt();

        System.out.println("Choose the Operation: 1.Add 2.Multiplication 3.Divide 4.Subtract");
        int choice = scn.nextInt();

        switch (choice) {
            case 1:	
                operation = new Add();
                break;

            case 2:
                operation = new Multiplication();
                break;

            case 3:
                operation = new Divide();
                break;

            case 4:
                operation = new Sub();
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        if (operation != null) {
            operation.setValue(x, y);
            c.performCalculation(operation);
        }

    }
}
