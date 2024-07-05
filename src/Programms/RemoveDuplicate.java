package Programms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>namelist=new ArrayList<Integer>();
		namelist.add(10);
		namelist.add(20);
		namelist.add(20);
		System.out.println(namelist);
		//For removing , we use LinkedHAshset
		LinkedHashSet<Integer>numberwithoutduplicate=new LinkedHashSet<Integer>(namelist);
		System.out.println(numberwithoutduplicate);
		System.out.println("-------------------------------");
		ArrayList<String>names=new ArrayList<String>();
		names.add("Balram");
		names.add("Pradeep");
		names.add("Balram");
		System.out.println(names);
		//For removing , we use LinkedHAshset
		LinkedHashSet<String>nameswithoutduplicate=new LinkedHashSet<String>(names);
		System.out.println(nameswithoutduplicate);

	}

}
