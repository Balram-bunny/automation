package Programms;

import java.util.HashSet;

public class Session9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet QA=new HashSet();
		QA.add("Pradeep");
		QA.add("Ashish");
		QA.add("Alkash");
     	QA.add("Dileep");
     	QA.add("Dileep");// Duplicacy not allowed
     	
     	System.out.println("Total QA :"+ QA); // Total QA :[Ashish, Alkash, Dileep, Pradeep]: Insertion order not preserved
     	
     	HashSet<String> dev=new HashSet<String>();
     	dev.add("Rishabh");
     	dev.add("Arijit");
     	dev.add("Nitin");
     	
     	System.out.println("Total dev :" + dev);
     	//Add dev to QA
     	QA.addAll(dev);
     	System.out.println("After adding :"+QA);
     	QA.remove("Pradeep");
     	System.out.println("After removing Pradeep"+QA);
     	//Remove dev team from QA
     	QA.removeAll(dev);
     	System.out.println("After removing Dev team from QA"+ QA);
     	System.out.println("Is Pradeep is there: "+ QA.contains("Pradeep"));
     	System.out.println(QA.containsAll(dev));
     	
     	System.out.println("Is QA Collection empty:"+ QA.isEmpty());
     	System.out.println("Size of QA :"+ QA.size());
     	QA.clear();
     	System.out.println("QA collection after clear :"+QA);
     	System.out.println("Is QA Collection empty:"+ QA.isEmpty());
     	QA.add("Pradeep");
		QA.add("Ashish");
     	//For each loop
     	for(Object e:QA)
     	{
     		System.out.println(e);
     	}
     	for(String e1: dev)
     	{
     		System.out.println(e1);
     	}
     	
     	
       

	}

}
