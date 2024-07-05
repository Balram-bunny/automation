package ArrayProgramm;

import java.util.Arrays;

public class Removeduplicate {

	public static void main(String[] args) {
		// Print Unique Element 
		int [] a = {10,3,3,10,10,};
		Arrays.sort(a);
				for(int i=0;i<a.length-1;i++)
				{
					if(a[i]!=a[i+1])
					{
						System.out.print(a[i]+" ");
					}
				}
				System.out.print(a[a.length-1]);
	}

}
