package Programms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		// Anagram means length and character should be same.
		String str="bored";
		String str1="robed";
    	if(str.length()!=str1.length())
		{
			System.out.println("given string is not anagram");
			System.exit(0);
		}
		
		char [] ch1=str.toCharArray();
		char [] ch2=str1.toCharArray();
		
//		if(ch1.length!=ch2.length)
//		{
//			System.out.println("given string is not anagram");
//			System.exit(0);
//		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				System.out.println("given string is not Anagram string");
				System.exit(0);
			}
		}
		System.out.println("Given string is Anagram");
	}

	
		
		
		
		
	}
	
	
	
	
	
	


