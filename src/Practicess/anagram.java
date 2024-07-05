package Practicess;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bored";
		String str1="robet";
		if(str.length()!=str1.length())
		{
			System.out.println("Given string is not pallindrome");
			System.exit(0);
		}
		char []ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch1[i])
			{
				System.out.println("Given string is not pallindrome");
				System.exit(0);
			}
		}
		System.out.println("given string is pallindrome");
		

	}

}
