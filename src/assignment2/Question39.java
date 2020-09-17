package assignment2;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the name:");
		String n = input.nextLine();

		String m = n.trim();
		String store = "";

		for (int i = 0; i < m.length(); i++) {
			char ch = m.charAt(i);
			if (ch != ' ') {
				store = store + ch;
			} else {
				System.out.print(Character.toUpperCase(store.charAt(0)) + ".");
				store = "";
			}
		}

		String store1 = "";
		for (int j = 0; j < store.length(); j++) {
			if (j == 0) {
				store1 = store1 + Character.toUpperCase(store.charAt(0));
			} else {
				store1 = store1 + Character.toLowerCase(store.charAt(j));
			}
		}
		System.out.print(store1);
	}
}
