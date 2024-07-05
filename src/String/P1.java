package String;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Difference between String and Stringbuffer
		String s=new String("Durga");
		
		
		 s.concat("Software");
		 
		System.out.println(s);// O/p: Durga ; it is because String is immutable (unchnagable) in nature so durga is declared in 's' object
		                       // But while concating it does not acquire addition into it.
		
		
		StringBuffer f=new StringBuffer("Durga");
		f.append("Software");
		System.out.println(f); //Durgasoftware;  it is because StringBuffer is mutable (chnagable) in nature 

	}

}
