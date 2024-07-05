package dowhile;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int f=0;
		int s=1;
		System.out.println(f);
		System.out.println(s);
		for(int i=2;i<n;i++)
		{
			int t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		
		}

	}

}
