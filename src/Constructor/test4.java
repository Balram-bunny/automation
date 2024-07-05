package Constructor;

public class test4 {
 test4(int a)
 {
	 System.out.println("constructor");
 }
 test4()
 {
	 System.out.println("default constructor");
 }
	public static void main(String[] args) {
     test4 t=new test4(10);
     test4 t1=new test4();

	}

}
