package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String[] args) {
		String inp = "Hello my black kitten. My black kitten is very beautiful. I really love black kittens! ";
		Pattern pattern = Pattern.compile("black(\\w*)");
		Matcher matcher = pattern.matcher(inp);
		String newStr = matcher.replaceAll("white");
		System.out.println(newStr);
	}

}
