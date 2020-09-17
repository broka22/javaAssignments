package assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question43 {

	public static void divide() {
		Scanner input = new Scanner(System.in);

		int[] array = new int[2];

		try {
			System.out.println("Enter the value of a:");
			int a = input.nextInt();

			System.out.println("Enter the value of b:");
			int b = input.nextInt();

			int div = a / b;
			System.out.println(div);
			System.out.println("Inside try block.");
			System.out.println(array[2]);

		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Inside catch block.");
		} catch (InputMismatchException ie) {
			System.out.println(ie);
			System.out.println("Inside catch block.");
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e);
		} finally {
			System.out.println("Inside finally block.");
			input.close();
		}
		System.out.println("More code.");
	}

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		//
		// System.out.println("Enter the value of a:");
		// int a = input.nextInt();
		//
		// System.out.println("Enter the value of b:");
		// int b = input.nextInt();

		Question43.divide();
	}
}
