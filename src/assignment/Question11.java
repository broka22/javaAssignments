package assignment;

import java.util.Scanner;

public class Question11 {

	public void temp(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The value of a using temp is now " + a);
		System.out.println("The value of b using temp is now " + b);
		System.out.println("========================================");
	}

	public void notTemp(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println("The value of a without temp is now " + a);
		System.out.println("The value of b without temp is now " + b);
	}

	public static void main(String[] args) {
		Question11 obj = new Question11();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = input.nextInt();
		System.out.println("Enter the value of b");
		int b = input.nextInt();

		obj.temp(a, b);
		obj.notTemp(a, b);

	}
}
