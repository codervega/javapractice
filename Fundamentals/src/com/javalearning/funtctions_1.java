package com.javalearning;

public class funtctions_1 {
	
	public void first() {
		System.out.println("Hello World");
	}
	public void second(int a)
	{
		System.out.println("the function in which we are is having one parameter");
	}
	public String third() 
	{
		return "hello";
	}
	public int fourth()
	{
		return 3;
	}
	public static void main(String[] args) {
		funtctions_1 obj=new funtctions_1();
		obj.first();
		obj.second(1);
		System.out.println(obj.third());
		System.out.println(obj.fourth());
	}

}
