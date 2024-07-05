package Programms;

import java.util.HashMap;
import java.util.HashSet;

public class missingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		HashMap<Integer, String> map3=new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//1. On the basis of key-value: use equals method:
		System.out.println(map1.equals(map2)); // true
		System.out.println(map1.equals(map3)); // false
		
		//2. compare hasmaps for the same keys: KeySet();  // Ignore Duplicacy
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		//3. Find out the extra key
		HashMap<Integer,String> map4=new HashMap<Integer,String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");

       //combine the keys from both the maps:using Hashset:
		HashSet<Integer> combinekeys=new HashSet<>(map1.keySet());
		//add the keyset from map4
		combinekeys.addAll(map4.keySet());
		combinekeys.removeAll(map1.keySet());
		System.out.println(combinekeys);
		

		

	}

}
