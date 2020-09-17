package assignment;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		System.out.println("enter the first number: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("enter the second number: ");
		int b = input.nextInt();

		int sum = a + b;
		int average = (a + b) / 2;

		System.out.println("The sum of " + a + " and " + b + " is: " + sum);
		System.out.println("The average of " + a + " and " + b + " is: " + average);

		input.close();
	}

}
