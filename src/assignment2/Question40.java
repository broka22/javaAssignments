package assignment2;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the string to be reversed:");
		String inp = input.nextLine();

		String reverse = "";//empty string to store the reversed string 

		for (int i = inp.length() - 1; i >= 0; i--) {//start from end - 1, till the beginning 
			reverse = reverse + inp.charAt(i);//store each char from the end
		}
		System.out.println(reverse);
	}
}
