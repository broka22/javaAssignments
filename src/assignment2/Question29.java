package assignment2;

import java.util.Scanner;

public class Question29 {

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = input.nextInt();
		double a = 0;
		for (int i = 1; i <= n; i++) {
			a = a + ((double) i / factorial(i));
		}
		// double a = factorial(n);
		System.out.println("The sum of the nth series is " + a);
		input.close();
	}

}
