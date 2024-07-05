package String;

public class p2 {

	public static void main(String[] args) {
		// == & .equals()                                // == : both refernce in same object then it will true otherwise false
		String s1=new String("durga");                   
		String s2= new String("durga");
		System.out.println(s1==s2);                   //false
		System.out.println(s1.equals(s2));            //true
		System.out.println("---------------------------");
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2= new StringBuffer("durga");
		System.out.println(sb1==sb2);                  //false
		
		System.out.println(sb1.equals(sb2));           //false
		
		//In Java, == is an operator that compares the references or memory addresses 
		//of objects to determine if they are the same, whereas . equals() is a method that 
		//compares the contents of the objects(For String only not for String buffer). For StringBuffer, it compares the refernce.
	}

}
