package assignmentGit;

import java.util.Scanner;

public class CombinedSolution {

	public void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public void highScore(int n) {
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

	public void reverse(int n) {
		int num = 0;
		while (n > 0) {
			num = num * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(num);
	}

	public void revSum(int n) {
		int sum = 0;
		int mult = 1;
		while (n > 0) {
			sum = sum + n % 10;
			mult = mult * (n % 10);
			n = n / 10;
		}

		System.out.println("Addition of the given numbers is " + sum);
		System.out.println("Multiplication of the given number is " + mult);
	}

	public static boolean isPrimenumber(int n) {
		boolean prime = true;
		if (n == 0 || n == 1) {
			prime = false;
			return prime;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	public static void firstNthPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrimenumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void allPrimebetween(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrimenumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void fibonacci(int inp) { 
		int a = 0, b = 0, c = 1;

		for (int i = 1; i <= inp; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}                                            
	}

	public static void pattern(int n) {
		for (int i = 0; i < n; i++) {// row
			int num = 1;
			for (int j = 0; j <= i; j++) {// column
				System.out.print(num + " ");
				num++;
			}
			System.out.print("\n");
		}
	}

}
