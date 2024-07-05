package String;

import java.util.HashSet;
import java.util.Set;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcc";
        Set<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            uniqueChars.add(input.charAt(i));
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (char c : uniqueChars) {
            resultBuilder.append(c);
        }

        String result = resultBuilder.toString();
        System.out.println(result); // Output: abc

	}

}
