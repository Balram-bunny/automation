package Programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Session5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Balram");
		al.add("Kumar");
		al.add("Nayak");
		
		ArrayList<String> al2 =new ArrayList<String>();
		al2.addAll(al);
		System.out.println(al2);
		System.out.println("Before Removing : " + al2);
		// To remove all the element of al from al2 
		al2.removeAll(al);
		System.out.println("After Removing : "+ al2);
		// for iteration
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		// For Each Loop
		for(String i:al)
		{
			System.out.println(i);
		}
		//Iteration
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// Sort in ascending order
		Collections.sort(al);
		System.out.println(al);
		//Sort in descending order/ Reverse order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse order :"+ al);
		// For shuffle
		Collections.shuffle(al);
		System.out.println(al);
		//Convert array to Arraylist
		String cars[]= {"volvo", "Rangerover"};
		ArrayList<String> al3=new ArrayList<String>(Arrays.asList(cars));
		System.out.println(al3);
		al3.add("Hyundai");
		System.out.println(al3);
	  al3.set(0, "AB");
	  System.out.println(al3);
		al3.add(0, "null");
		System.out.println(al3);
		//Sorting
		Collections.sort(al3);
		System.out.println("After sorting : "+ al3);
		//Reverse Order
		Collections.sort(al3, Collections.reverseOrder());
		System.out.println("After Reverse order :"+ al3);
		

	

		}
}
