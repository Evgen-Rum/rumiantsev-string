package strings;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter some line.");
		String str = sc.nextLine();
		System.out.println("Please enter the number of letter witch you find.");
		int numOfLetter = 0;
		for (int i = 0; i < 3; i++) {
			if (sc.hasNextInt()) {
				numOfLetter = sc.nextInt();
				break;
			} else if (i < 2){
				System.out.println("Incorrect data! Please enter whole number!");
				sc.next();
			}  else {
				System.out.println("Inccorect data! End of the program!");
			}
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == numOfLetter) {
				count++;
			}
		}
		System.out.println("Number of " + numOfLetter + " letters in your line: " + count);
	}

}
