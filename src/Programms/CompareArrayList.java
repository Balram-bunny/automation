package Programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String>l2=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String>l3=new ArrayList<String>(Arrays.asList("B","A","C","D","E"));

		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));

      //2. Compare two list, find out the additional 
		
		ArrayList<String>l4=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String>l5=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		l4.removeAll(l5);
		System.out.println(l4);
		//Find common list
		l4.retainAll(l5);
		System.out.println(l4);
	}

}
