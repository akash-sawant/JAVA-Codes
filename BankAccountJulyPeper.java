import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
        }
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied at rate " + interestRate + "%: " + interest + ". New Balance: " + balance);
    }
}

public class BankAccountJulyPeperQue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = scn.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scn.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = scn.nextDouble();

        SavingAccount account = new SavingAccount(accountNumber, initialBalance, interestRate);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply Interest");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scn.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scn.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.applyInterest();
                    break;
                case 4:
                    System.out.println("Current Balance: " + account.balance);
                    break;
                case 5:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scn.close();
    }
}
