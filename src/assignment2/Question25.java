package assignment2;

import java.util.Scanner;

public class Question25 {

	public static void highScore(int n) {
		int high = 0;
		String highName = null;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the name:");
			String name = input.next();

			System.out.println("Enter the score:");
			int score = input.nextInt();

			if (high < score) {
				high = score;
				highName = name;
			}
		}
		System.out.println(highName + " has the highest score with " + high + " points.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of students:");
		int n = input.nextInt();
		highScore(n);
	}
}
