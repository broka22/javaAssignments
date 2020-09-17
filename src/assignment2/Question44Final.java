package assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question44Final {

	public static void main(String args[]) throws FileNotFoundException {
		// Reading the word to be found from the user
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the word to be found");
		String word = sc1.next();
		System.out.println(word + " hello");
		boolean flag = false;
		int count = 0;
		System.out.println("Contents of the line");
		// Reading the contents of the file
		Scanner sc2 = new Scanner(new FileInputStream("/Users/bimalroka/Desktop/studentInfo.txt"));
		while (sc2.hasNextLine()) {
			String line = sc2.nextLine();
			System.out.println(line);
			if (line.indexOf(word) != -1) {
				flag = true;
				count = count + 1;
			}
		}
		if (flag) {
			System.out.println("File contains the specified word " + word);
			System.out.println("Number of occurrences is: " + count);
		} else {
			System.out.println("File does not contain the specified word");
		}
	}
}
