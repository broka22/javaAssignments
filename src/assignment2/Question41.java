package assignment2;

import java.util.Scanner;

public class Question41 {

	public String duplicate(String inp) {
		String storChar = "";
		String storeDup = "";

		for (int i = 0; i < inp.length(); i++) {
			String store = Character.toString(inp.charAt(i));//iterate each char one by one
			if (storChar.contains(store)) {//check if they contain same char
				if (!storeDup.contains(store)) {//then check if they do not contain same char
					storeDup += store + ",";//if it does then concat with store
				}
			}
			storChar += store;//concat with store
		}
		return storeDup;//return duplicate 
	}

	public static void main(String[] args) {
		Question41 obj = new Question41();

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the string:	");
		String inp = input.nextLine();

		obj.duplicate(inp);

		String out = obj.duplicate(inp);
		System.out.println(out);
	}
}
