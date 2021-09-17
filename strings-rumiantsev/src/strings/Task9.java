package strings;

public class Task9 {
	public static void main(String[] args) {
		String str = "Nissan x-trail, xor beginner, xXx";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				count++;
			}
		}
		System.out.println("Number of x letters in line: " + count);
	}

}
