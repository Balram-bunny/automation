
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=345;
		int rev=0;
		int remainder;
		
		while(a!=0)
		{
			remainder=a%10;
			rev= rev*10+remainder;
			a=a/10;
		}
		System.out.println(rev);

	}

}
