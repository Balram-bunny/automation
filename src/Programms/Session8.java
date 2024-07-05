package Programms;

import java.util.Iterator;
import java.util.LinkedList;

public class Session8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
		// Stack : First In Last Out
		al.push("Balram");
		al.push("Kumar");
		al.push("Nayak");
		System.out.println(al); // [Nayak, Kumar, Balram]
		al.pop();
		System.out.println(al); // [Kumar, Balram]
        // For Retrieval
	
        System.out.println(al.peek());//  Retrieve the first element of the list
        System.out.println(al.peekFirst());// Retrieves but does not remove , the first element of this list
       
        System.out.println(al.peekLast());//Retrieves but does not remove , the last element of this list or returns null , if this list is empty
      // For Loop
        for(int i=0;i<al.size();i++)
        {
        	System.out.println("Using for loop: "+ al.get(i));
        	
        }
        // For Each loop :
        for(String i:al)
        {
        	System.out.println("Using for each loop : "+ i);
        }
        // Using Iterator method
        Iterator it= al.iterator();
        while(it.hasNext())
        {
        	System.out.println("Iterative method : "+ it.next());
        }
        
	}

}
