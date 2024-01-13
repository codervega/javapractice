package com.javalearning;

public class local_variable {
	public void dosomthing()
	{
		int a=10;
		System.out.println(a);
	}
	public int dosomethingagain()
	{
		int a=30;
		return a;
	}

	public static void main(String[] args) {
       local_variable obj=new local_variable();
       obj.dosomthing();
       int k=obj.dosomethingagain();
       System.out.println(k);      
	}

}
