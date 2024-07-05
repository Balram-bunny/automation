package Programms;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(12);
		al.add("Balram");
		al.add(12.34);
		al.add('a');
		System.out.println(al);
		System.out.println("size :"+ al.size());
		//remove an element
		al.remove(1);
		System.out.println("remove Balram"+ al);
		//get mthod to access value
		System.out.println(al.get(0));
		// set method used to replace /change element
		al.set(0, "balram");
		System.out.println(al);
		al.add(1, "Nayak");
		System.out.println("After insert element :"+ al);
		//contains : to search element in arraylist
		System.out.println(al.contains("balram"));// give boolean values
		System.out.println("Is arraylist empty: "+ al.isEmpty());

	}

}
