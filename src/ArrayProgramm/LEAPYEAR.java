package ArrayProgramm;

public class LEAPYEAR {

	public static void main(String[] args) {
		// IF NUM DIVISIBLE BY 400 & 4 THEN IT WILL BE LEAP YEAR 
		//if num divisible by 100 then it is not leap year
		int num=1600;
//		if(num%400==0)
//		
//			System.out.println(num + " is a leap year");
//		else if(num%100==0)
//			
//			System.out.println(num + " is not a leap year");
//		
//		else if(num%4==0)
//		
//			System.out.println(num + " is a leap year");
		if((num%400 & num%4) ==0 & num%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("is not leap year");
		}
		
		
		
	}

}
