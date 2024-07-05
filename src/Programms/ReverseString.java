package Programms;

public class ReverseString {
	public void m1() {
		String str = "BALRAM";
		String rev = "";
		int a = str.length();
		System.out.println(a);
		for (int i = a - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a boy";
		
		String rev = "";
		int count = 0;
		int a = str.length();
		for (int i = a - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			count++;
		}
		System.out.println(rev);
		System.out.println(count);
		ReverseString r = new ReverseString();
		r.m1();
	}

}
// Here length is 4 but index will be 0,1,2,3 so we are subtracting
