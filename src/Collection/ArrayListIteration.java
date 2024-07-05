package Collection;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("Rudra");
		ar1.add("pratap");
		ar1.add("singh");

		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		System.out.println("------------------------------------");
		
		for(String s:ar1)
		{
			System.out.println(s);
		}
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Rahul");
		ar2.add("raj");
		ar1.addAll(ar2);
		System.out.println(ar1);

	}

}
