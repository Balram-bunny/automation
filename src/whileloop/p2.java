package whileloop;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int count=0;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i +" is a even number");
				count++;
			}
			i++;
		}
		System.out.println(count);

	}

}
