package Programms;


public class removeduplicat {
	public void m1() {
	String str="MOOM";
	String strl="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(strl.indexOf(ch)<0)
		{
			strl=strl+ch;
		}
		
	}
	System.out.println(strl);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Balram";   //  Result should be: abc
		String strl="";
	
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(strl.indexOf(ch)<0)
			{
				strl=strl+ch;
			}
		}
		System.out.println(strl);
		removeduplicat r=new removeduplicat();
		r.m1();
	

	}
	

			
	}

	


