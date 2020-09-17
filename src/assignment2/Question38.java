package assignment2;

import java.util.Scanner;

public class Question38 {

	//No need to make an object for static method
	public static String isPalindrome(String n) {//use class.method name to return from this method
		String bool = "false";
		int i = 0;
		int j = n.length() - 1;

		for (i = 0; i < j; i++) {
			if (n.charAt(i) == n.charAt(j))
				bool = "true";
			i++;
			j--;
		}
		return bool;
	}

	public static void main(String[] args) {
		//Question38 obj = new Question38();//use this for non-static method
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String to check the palindrome.");
		String in = input.next();

		Question38.isPalindrome(in);//send string to method isPalindrome

//		if (isPalindrome(in)) {//
//			System.out.println("The given string is a palindrome.");
//		} else {
//			System.out.println("The given string is not a palindrome.");
//		}
		
		String out = Question38.isPalindrome(in);
		System.out.println(out);
	}
}
