package com.javalearning;

class abhishekdata{
	String name;
	int age;
	public abhishekdata(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("My name"+this.name+" my age"+this.age);
	}
}

public class this_key2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abhishekdata obj=new abhishekdata("Abhishek Shukla",20);
		obj.display();

	}

}
