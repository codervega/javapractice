package com.javalearning;

public class typecasting_1 {
	public void widening()
	{
		int a=10;
		long b=a;
		System.out.print(b);
	}
	public void narrowing()
	{
		long a=100;
		int q = (int)a;
		System.out.println(q);
		
		// Loss Of data is a disadvantage of 
		//explicit type casting
		
		long j=670;
		byte l=(byte) j;
		System.out.println(l);
	}

	public static void main(String[] args) {
		typecasting_1 obj=new typecasting_1();
		obj.narrowing();
		obj.widening();
	}

}
