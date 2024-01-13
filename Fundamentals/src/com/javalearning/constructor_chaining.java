package com.javalearning;

class Abhishek{
	public Abhishek(){
		System.out.print("Hello , My Name Is Abhishek Shukla");
	}
	public Abhishek(String Name)
	{
		this();
		System.out.println("Hello My age is 20");
		// this(); this must be the first line inside the 
		       //constructor 
	}
}

public class constructor_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abhishek obj=new Abhishek("name");

	}

}
