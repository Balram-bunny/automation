package Programms;

import java.util.HashSet;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "Balram";

	        // Convert the string to a character array
	        char[] charArray = str.toCharArray();

	        // Create a HashSet to store unique characters
	        HashSet<Character> charSet = new HashSet<>();

	        // Iterate through the character array and add each character to the HashSet
	        for (char c : charArray) {
	            charSet.add(c);
	        }

	        // Reconstruct the string from the unique characters in the HashSet
	        StringBuilder result = new StringBuilder();
	        for (char c : charSet) {
	            result.append(c);
	        }

	        // Print the result
	        System.out.println("Original String: " + str);
	        System.out.println("String after removing duplicates: " + result.toString());

	}

}
