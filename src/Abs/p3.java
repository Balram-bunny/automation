package Abs;

public class p3 {
  public void m1()
  {
	  int a=10;
	  int b=20;
	  int temp ;
	  temp=a;
	  a=b;
	  b=temp;
	  System.out.println(a);
	  System.out.println(b);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;  //20
		int b=20;
		
		
		a = a + b;//30
				b = a - b; // b = a 30-20=10
				a = a - b; //
		System.out.println(a);
		System.out.println(b);
		p3 p=new p3();
		p.m1();

	}

}
