package assignment2;

import java.util.Scanner;

public class Question27 {

	public void revSum(int n) {
		int a = 0;
		while (n > 0) {
			a = a + n % 10;
			n = n / 10;
		}

		System.out.println("Addition of the given numbers is " + a);
	}

	public void revProduct(int n) {
		int a = 1;
		while (n > 0) {
			a = a * (n % 10);
			n = n / 10;
		}
		System.out.println("Multiplication of the given number is " + a);
	}

	public static void main(String[] args) {
		Question27 obj = new Question27();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = input.nextInt();
		obj.revSum(n);
		obj.revProduct(n);
	}
}
