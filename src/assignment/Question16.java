package assignment;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Please enter any number");
		int a = num.nextInt();

		if (a % 2 == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");

	}

}
