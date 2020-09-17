package assignment6;

public class BankAccount {

	private String name;
	private double initialBalance;
	private int accountNum;
	private static int accountNumber = 1;

	public BankAccount(String name) {
		this.name = name;
		this.initialBalance = 0;
		this.accountNum = accountNumber++;
		displayInfo();
	}

	public BankAccount(String name, double intialBalance) {
		this.name = name;
		this.initialBalance = intialBalance;
		this.accountNum = accountNumber++;
		displayInfo();
	}

	public void depositFund(double amount) {
		initialBalance = initialBalance + amount;
		displayInfo();
	}

	public void depositFund(double amount, double interest) {
		initialBalance = initialBalance + amount;
		initialBalance = initialBalance + (initialBalance * interest / 100);
		displayInfo();
	}

	public void withdrawFund(double amount) {
		initialBalance = initialBalance - amount;
		displayInfo();
	}

	public void withdrawFund(double amount, double fee) {
		initialBalance = initialBalance - amount - fee;
		displayInfo();
	}

	public void displayInfo() {
		System.out.println("==================");
		System.out.println("Account Name is: " + name);
		System.out.println("Account number is: " + accountNum);
		System.out.println("Balance is: " + initialBalance);
		System.out.println("==================");
	}

}
