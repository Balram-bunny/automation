package ArrayProgramm;

public class fibonacci {

	public static void main(String[] args) {
		// first will be second and second will be first 
		int n=6;
		int f=0;
		int s=1;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=n;i++)
		{
			int t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}


	}

}
