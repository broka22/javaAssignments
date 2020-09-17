package assignment;

import java.util.Scanner;

public class Question18 {

	private void largestNum(int x, int y, int z) {

		if (x > y && x > z) {
			System.out.println("The largest number is " + x);
		} else if (y > x && y > z) {
			System.out.println("The largest number is " + y);
		} else {
			System.out.println("The largest number is " + z);
		}
	}

	public static void main(String[] args) {
		Question18 obj = new Question18();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first value");
		int n = input.nextInt();

		System.out.println("Enter the second value");
		int o = input.nextInt();

		System.out.println("Enter the third value");
		int p = input.nextInt();

		obj.largestNum(n, o, p);
	}
}
