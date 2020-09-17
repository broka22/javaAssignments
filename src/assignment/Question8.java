package assignment;

import java.util.Scanner;

public class Question8 {
	
	public void CelsiusConversion(double n){
		double f = (9/5*n)+32;
		System.out.println("The temperature in fahrenheit is "+ f +" F");
	}
	
	public void FahrenheitConversion(double n) {
		double c = (n-32)*5/9;
		System.out.println("The temperature in Celsius is "+ c +" C");
	}
	
	public static void main(String[] args) {
		Question8 obj = new Question8();
		Scanner input = new Scanner(System.in);
		String decision = "";
		
		do {
			System.out.println("Please enter your choice:");
			int n = input.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter the temperature to be converted to fahrenheit");
			double c = input.nextDouble();
			obj.CelsiusConversion(c);
			break;

		case 2:
			System.out.println("Enter the temperature to be converted to celsius");
			double f = input.nextDouble();
			obj.FahrenheitConversion(f);
			break;
			
		default:
			System.out.println("wrong option");
			break;
		}
		System.out.println("============================");
		System.out.println("type y|Y to continue");
		decision = input.next();
		} while (decision.equalsIgnoreCase("y|Y"));
		
		System.out.println("Thank you!!");
		input.close();
	}
}
