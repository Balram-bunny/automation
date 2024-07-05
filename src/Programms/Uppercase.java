package Programms;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="RAHUL BALRAM PRADEEP";
		String[] s = name.split(" ");
		for(int i = 0;i<s.length;i++)
		{
			System.out.print(String.valueOf(s[i].charAt(0))+s[i].substring(1).toLowerCase()+" ");
		}
	

	}

}
