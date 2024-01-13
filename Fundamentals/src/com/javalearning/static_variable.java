package com.javalearning;

public class static_variable {
    static int data=200;
	public static void main(String[] args) {
		System.out.println(static_variable.data);
		
		// we can access the static variable using object
		// but not recommended in mordern java
		
		static_variable obj=new static_variable();
		static_variable obj2=new static_variable();
		
		System.out.println("---Before the updation---");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data=500;
		
		System.out.println("---After the Updation---");
		System.out.println(obj.data);
		System.out.println(obj2.data);

	}

}
