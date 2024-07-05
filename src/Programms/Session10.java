package Programms;

import java.util.HashSet;

public class Session10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet SetA=new HashSet();
		SetA.add(0);
		SetA.add(2);
		SetA.add(4);
		SetA.add(6);
		SetA.add(8);
		System.out.println(SetA);
		HashSet SetB=new HashSet();
		SetB.add(1);
		SetB.add(2);
		SetB.add(3);
		SetB.add(4);
		SetB.add(5);
		System.out.println(SetB);
		
//	// Set A union SetB
//		SetA.addAll(SetB);
//		System.out.println("SetA union SetB : "+SetA);
		
	//Set A intersection SetB
//		SetA.retainAll(SetB);
//		System.out.println("Set A intersection SetB:"+SetA);// [2, 4]
//		
		// Set A- Set B
//		SetA.removeAll(SetB);
		System.out.println("Set A- Set B :"+ SetA);// [0, 6, 8]
		// Is A is subset of B
		System.out.println("Is A is subset of B:"+ SetA.containsAll(SetB));

	}

}
