package Programms;

public class Pallindrome {
	// when u reverse it will same like MOM, NITIN
//	public void m1()
//	{
//		
//		String name="robor";
//		int i=0;               // 0
//		int j=name.length()-1; //4
//		while(i<j)
//		{
//			if(name.charAt(i)!=name.charAt(j))
//			{
//				System.out.println("given string is not pallindrome");
//				break;
//			}
//			i++;
//			j--;
//		}
//		System.out.println("Given string is pallindrome");
//	}

	public static void main(String[] args) {
		// Compare i with j
		String name="NITINN";
		int i=0;
		int j=name.length()-1;
		while(i<j)
		{
			if(name.charAt(i)!=name.charAt(j))
			{
				System.out.println("given string is not pallindrome");
				System.exit(0);
			
			}
			i++;
			j--;			
		}
		System.out.println("given string is  pallindrome");
		Pallindrome p=new Pallindrome();
//		p.m1();
		

	}

}
