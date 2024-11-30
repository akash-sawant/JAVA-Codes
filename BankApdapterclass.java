interface Bank
{
	void deposit(int value);
	void widrwal(int value);
	int getBalance();
}
class SavingBank implements Bank
{
	private int balance;
	private double interest=0.05;
	public void deposit(int value)
	{
		balance=value;
	}
	public void  widrwal(int value)
	{
		int wid = balance-value; // 10000-2500
		balance = balance+(int)(wid*interest);
		balance = balance-value;
	}
	public int getBalance()
	{
		return balance;	
	}
}
class CurrentBank implements Bank
{
	private int balance;
	private double interest=0.10;
	public void deposit(int value)
	{
		balance=value;
	}
	public void  widrwal(int value)
	{
		int wid = balance-value; // 10000-2500
		balance = balance+(int)(wid*interest);
		balance = balance-value;
	}
	public int getBalance()
	{
		return balance;	
	}
}
class AdoptorClass {
	
	Bank bank;
	void setBank(Bank bank)
	{	
		this.bank=bank;
	}
	void performDeposit(int value)
	{
		bank.deposit(value);
	}
	void performWithdrawl(int value)
	{
		bank.widrwal(value);
	}
	void display(String str)
	{
		System.out.println(str+"Bank Remaining Balnce :"+bank.getBalance());
	}	
}
public class BankApdapterclass{

	public static void main(String args[])
	{
		Bank b = new SavingBank();
		AdoptorClass aObject = new AdoptorClass();
		aObject.setBank(b);
		aObject.performDeposit(10000);
		aObject.performWithdrawl(2500);
		aObject.display("Saving");
		
		
		b = new CurrentBank();
		aObject = new AdoptorClass();
		aObject.setBank(b);
		aObject.performDeposit(10000);
		aObject.performWithdrawl(2500);
		aObject.display("Current");
	
	}
}