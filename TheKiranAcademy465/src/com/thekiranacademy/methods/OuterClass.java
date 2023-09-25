package com.thekiranacademy.methods;

public class OuterClass {
	int no1;
	void sq()
	
	{
		no1=10;
		System.out.println("Squre="+(no1*no1));
		
	}
	static class InnerClass{
		int no1;
		void sq()
		
		{
			no1=11;
			System.out.println("Squre="+(no1*no1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          OuterClass o=new OuterClass();
          o.sq();
          InnerClass I=new InnerClass();
          I.sq();
	}

}
