package strings;

import java.util.Scanner;

public class Task7 {
	public static String ChangeSymbols(String text, String symbolBefore, String symbolAfter) {
		return text.replaceAll(symbolBefore, symbolAfter);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(ChangeSymbols("asasas", "a", "b"));

	}
}
