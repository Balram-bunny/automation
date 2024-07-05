package ArrayProgramm;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a[]= {1,2,3,4,5};
		int su=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int res=su-sum;
		System.out.println(res);
		

	}

}
