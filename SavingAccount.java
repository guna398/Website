package SavingAccount;

public class SavingAccount
{
	private  double balance;
	private  double interest;

	public SavingAccount()
	{
		balance = 0;
		interest = 0;
	}

	public SavingAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}

