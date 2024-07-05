package Programms;

import java.util.HashMap;
import java.util.Iterator;


public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalmap=new HashMap<String,String>();
		capitalmap.put("India", "New Delhi");// form of key & value
		capitalmap.put("USA", "Chicago");
		capitalmap.put("UK", "London1");
		capitalmap.put("UK", "London");// no duplicate will print latest one
		capitalmap.put(null,"Berlin");
		capitalmap.put(null, "Sun");// can accept null values

		System.out.println(capitalmap.get("USA"));
		System.out.println(capitalmap.get("UK"));  // London
		System.out.println(capitalmap.get(null));
		
		//iterator
	Iterator<String>it=capitalmap.keySet().iterator();
	while(it.hasNext())
	{
		String key=it.next();
		String value=capitalmap.get(key);
		System.out.println("key ="+key+ "value="+value);
	}


	}

}
