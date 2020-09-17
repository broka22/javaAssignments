package assignment;

import java.util.Scanner;

public class Question17 {

	public void leapYear(int n) {
		if (n % 400 == 0) {
			System.out.println("This is a leap year");
		}

		else if (n % 4 == 0) {
			System.out.println("This is a leap year");
		}

		else if (n % 100 == 0) {
			System.out.println("This is not a leap year");
		}

		else {
			System.out.println("This is not a leap year");
		}
	}

	public static void main(String[] args) {
		Question17 obj = new Question17();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year to check whether it's a leap year or not");
		int n = input.nextInt();
		obj.leapYear(n);
	}
}
