package String;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="BALRAM KUMAR NAYAK";
		String[] s1=s.split(" ");
        for(String x : s1) {
        	String answer = x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase();
        	System.out.println(answer); //Balram Kumar Nayak
        }
	}

}
