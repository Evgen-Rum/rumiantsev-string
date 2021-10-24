package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String[] args) {
		String[] inp = {
				"Hello my bLAck kitten. My BlacK kitten is very beautiful. I really love BLACK kittens! blackage. ",
				"BlAcK", "BLACKAGED, blackBlack" };
		for (int i = 0; i < inp.length; i++) {
			Pattern pattern = Pattern.compile("(?i)\\bblack\\b");
			Matcher matcher = pattern.matcher(inp[i]);
			String newStr = matcher.replaceAll("white");
			System.out.println(newStr);
		}
	}

}
