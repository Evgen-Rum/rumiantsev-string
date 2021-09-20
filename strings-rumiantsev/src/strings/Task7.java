package strings;

import java.util.Scanner;

public class Task7 {
	public static String ChangeSymbols(String text, String symbolBefore, String symbolAfter) {
		return text.replaceAll(symbolBefore, symbolAfter);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter text." + "\n");
		String text = sc.nextLine();
		System.out.println("Please enter replaceable symbol in text." + "\n");
		String symbolBefore = sc.nextLine();
		System.out.println("Please enter symbol you want to insert in text!" + "\n");
		String symbolAfter = sc.nextLine();
		System.out.println(ChangeSymbols(text, symbolBefore, symbolAfter));

	}
}
