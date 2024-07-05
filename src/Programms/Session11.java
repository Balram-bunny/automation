package Programms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Session11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> LHS= new LinkedHashSet<Integer>();
//		LHS.add(1);
//		LHS.add(2);
//		LHS.add(3);
//		LHS.add(4);
//		LHS.add(5);
//		
//		System.out.println("Insertion order is maintained :"+LHS);
		
		HashSet<Integer> HS=new HashSet<Integer>();
		HS.add(1);
		HS.add(2);
		HS.add(3);
		HS.add(4);
		HS.add(5);
		HS.add(8);
		HS.add(9);
		HS.add(10);


		System.out.println("Insertion order is not maintained:"+ HS);





	}

}
