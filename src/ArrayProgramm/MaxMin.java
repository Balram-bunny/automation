package ArrayProgramm;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1000,120,65,10,87};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum number is :"+max);
		System.out.println("Minimum number is : "+min);

	}

}
