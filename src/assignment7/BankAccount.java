package assignment7;

public class BankAccount {

	String name;
	double inBal;
	int accNum;
	static int accNo = 100;

	public BankAccount(String name) {
		this.name = name;
		this.inBal = 0.0;
		this.accNum = accNo++;
		displayInfo();
	}

	public BankAccount(String name, int inBal) {
		this.name = name;
		this.inBal = inBal;
		this.accNum = accNo++;
		displayInfo();
	}

	public void withdrawFunds(double amount) {
		inBal = inBal - amount;
		displayInfo();
	}

	public void withdrawFunds(double amount, int fee) {
		inBal = inBal - amount - fee;
		displayInfo();
	}

	public void depositFunds(double deposit) {
		inBal = inBal + deposit;
		displayInfo();
	}

	public void depositFunds(double deposit, double interest) {
		inBal = inBal + deposit + interest;
		displayInfo();
	}

	public void displayInfo() {
		System.out.println("Welcome to Java Bank");
		System.out.println("--------------------");
		System.out.println("Account name: " + name);
		System.out.println("Account number: " + accNum);
		System.out.println("Current balance: $" + inBal);
		System.out.println("--------------------");
	}
}
