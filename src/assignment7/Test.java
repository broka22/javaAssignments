package assignment7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("What would you like to do today?");
		// System.out.println("1. Check Balance\n2. Withdraw money\n3. Deposit
		// money\n4. Open account\n5. Exit");
		// int inp = input.nextInt();
		BankAccount obj = new BankAccount("Ram");
		obj.depositFunds(100);
		obj.withdrawFunds(50);

		BankAccount ob = new BankAccount("Shyam", 1000);
		ob.depositFunds(100, 3);
		ob.withdrawFunds(20, 10);
	}

}
