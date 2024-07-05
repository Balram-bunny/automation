package Thiskeyword;
//Constructor chaining 
public class test1 {
    test1()
    {
    	this(10);
    	System.out.println("zero parameter");
    }
    test1(int a)
    {
    	this(10,20);
    	System.out.println("one parameter");
    }
    test1(int a,int b)
    {
    	System.out.println("two parameter");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t=new test1();

	}

}
