package Operator;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int num;
		num=2024;
		s=(num%4==0 && num%400==0 )?(num +" is leap year"):(num + " is not a leap year");
		System.out.println(s);

	}

}
