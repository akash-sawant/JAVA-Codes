/*Create a BankAccount POJO class with fields accountNumber, accountHolderName, 
and balance. Create a subclass SavingsAccount with an additional field interestRate. 
Write a program to:
1. Initialize both types of accounts using parameterized constructors.
2. Add a method in SavingsAccount to calculate the annual interest earned (interest = 
balance * interestRate / 100).
3. Display account details along with the calculated interest.*/

import java.util.Scanner;

class BankAccount {
    int aNumber;
    String aHName;
    double Bal;

    public BankAccount(int aNumber, String aHName, double Bal) {
        this.aNumber = aNumber;
        this.aHName = aHName;
        this.Bal = Bal;
    }

    public int getANumber() {
        return aNumber;
    }

    public String getAHName() {
        return aHName;
    }

    public double getBal() {
        return Bal;
    }

    public void AccountDeatils() {
        System.out.println("Account Number: " + aNumber);
        System.out.println("Account Holder Name: " + aHName);
        System.out.println("Account Balance: " + Bal);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int aNumber, String aHName, double Bal, double interestRate) {
        super(aNumber, aHName, Bal);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBal() * interestRate / 100;
    }

    @Override
    public void AccountDeatils() {
        super.AccountDeatils();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Annual Interest Earned: " + calculateInterest());
    }
}

public class BankAccountInterestRate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Bank Account details
        System.out.println("Enter the Bank Account Details:");
        System.out.print("Enter the Account Number: ");
        int aNumber = scn.nextInt();
        scn.nextLine(); // Consume the newline

        System.out.print("Enter the Account Holder Name: ");
        String aHName = scn.nextLine();

        System.out.print("Enter the Account Balance: ");
        double Bal = scn.nextDouble();

        BankAccount ba = new BankAccount(aNumber, aHName, Bal);

        // Saving Account details
        System.out.println("\nEnter the Savings Account Details:");
        System.out.print("Enter the Account Number: ");
        int SavingaNumber = scn.nextInt();
        scn.nextLine(); // Consume the newline

        System.out.print("Enter the Account Holder Name: ");
        String SavingaHName = scn.nextLine();

        System.out.print("Enter the Account Balance: ");
        double SavingBal = scn.nextDouble();

        System.out.print("Enter the Interest Rate: ");
        double interestRate = scn.nextDouble();

        SavingsAccount sa = new SavingsAccount(SavingaNumber, SavingaHName, SavingBal, interestRate);

        // Display details
        System.out.println("\nBank Account Details:");
        ba.AccountDeatils();

        System.out.println("\nSavings Account Details:");
        sa.AccountDeatils();

        
    }
}
