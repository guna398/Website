package SavingAccount;

public class SavingAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sanaSavings = new SavingAccount(1000, 0.10);
		sanaSavings.withdraw(250);
		sanaSavings.deposit(400);
		sanaSavings.addInterest();
		System.out.println(sanaSavings.getBalance());
		System.out.println("Expected: 1265.0");

	}

}
