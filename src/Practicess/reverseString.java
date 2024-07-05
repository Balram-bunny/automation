package Practicess;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Keerti";
		String rev="";
		int a=str.length();
		for(int i=a-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
