package assignmentGit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CombinedSolution obj = new CombinedSolution();
		Scanner input = new Scanner(System.in);
		String decision = "";

		do {
			System.out.println("Please enter your choice:");
			int inp = input.nextInt();

			switch (inp) {
			case 1:
				System.out.println("Please enter the number to check the factorial:");
				int n = input.nextInt();
				obj.factorial(n);
				break;

			case 2:
				System.out.println("Please enter the number of students to find the highest score:");
				int o = input.nextInt();
				obj.highScore(o);
				break;

			case 3:
				System.out.println("Please enter the number to be reversed:");
				int p = input.nextInt();
				obj.reverse(p);
				break;

			case 4:
				System.out.println("Please enter the number to be summed and multiplied as a digit:");
				int q = input.nextInt();
				obj.revSum(q);
				break;
				
			case 5:
				System.out.println("Please enter the number to check whether prime or not:");
				int r = input.nextInt();
				boolean store = CombinedSolution.isPrimenumber(r);
				if (store == true) {
					System.out.println("The number is prime");
				} else {
					System.out.println("The number is not prime");
				}
				break;

			case 6:
				System.out.println("Please enter the number to check the nth prime:");
				int s = input.nextInt();
				CombinedSolution.firstNthPrime(s);
				break;

			case 7:
				System.out.println("Please enter the start number to check all the Prime numbers in between:");
				int t = input.nextInt();
				System.out.println("Please enter the end number to check all the Prime numbers in between:");
				int u = input.nextInt();
				CombinedSolution.allPrimebetween(t, u);
				break;

			case 8:
				System.out.println("Please enter the end number to find the factorial:");
				int v = input.nextInt();
				CombinedSolution.fact(v);
				break;

			case 9:
				System.out.println("Please enter a number to find the fibonacci:");
				int w = input.nextInt();
				CombinedSolution.fibonacci(w);
				break;

			case 10:
				System.out.println("Please enter a number to find the pattern:");
				int x = input.nextInt();
				CombinedSolution.pattern(x);
				break;

			default:
				break;
			}
			System.out.println("============================");
			System.out.println("type y|Y to continue");
			decision = input.next();
		} while (decision.equalsIgnoreCase("y"));

		System.out.println("Thank you!!");
		input.close();
	}
}
