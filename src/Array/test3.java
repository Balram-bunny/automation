package Array;

public class test3 {

	public static void main(String[] args) {
		int a[][]= new int [2][3];
		a[0][0]=4; a[0][1]=11; a[0][2]=44;
		a[1][0]=31; a[1][1]=10; a[1][2]=6;
		 int min = a[0][0];
		
		
		//System.out.println(a[1][1]);
		for(int i=0; i<2;i++)
		{
			for (int j=0; j<3;j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			
		}
		System.out.println(min);

	}

}
