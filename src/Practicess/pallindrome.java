package Practicess;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="NityytfytfyufgghtiN";
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				System.out.println("Given string is not paalindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Given string is pallindrome");

	}

}
