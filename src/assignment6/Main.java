package assignment6;

public class Main {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount("John");
		obj.depositFund(200);
		obj.withdrawFund(100);
		
		BankAccount obj1 = new BankAccount("Doe", 1500);
		obj1.depositFund(100,10);
		obj1.withdrawFund(400);
		
	}
}
