package assignment2;

import java.util.Scanner;

public class Question42 {

	public static void main(String[] args) {
		Question42 obj = new Question42();

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the string:	");
		String inp = input.nextLine();

		String[] in = inp.split(" ");

		for (int i = 0; i < in.length; i++) {
			for (int j = i + 1; j < in.length; j++) {
				if (in[i].contains(in[j])) {
					System.out.println(in[i]);
				}
			}
		}
	}
}
