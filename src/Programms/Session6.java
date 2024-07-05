package Programms;

import java.util.LinkedList;

public class Session6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>al=new LinkedList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println("List of collection1"+ al);
		LinkedList<String>al2=new LinkedList<String>();
		al2.add("D");
		al2.add("E");
		al2.add("F");
		System.out.println("List of collection2"+ al2);
		
		// Adding collection-2 in collection-1
		al.addAll(al2);
		System.out.println("After adding collection-2 in collection-1 : "+al);
		//Remove collection-2 from collection-1
		al.removeAll(al2);
		System.out.println(al);
      System.out.println(al.contains("a"));
      al.retainAll(al2);
      System.out.println(al);
     
		
		

	}

}
