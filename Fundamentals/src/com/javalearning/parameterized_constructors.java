package com.javalearning;
class student{
	int id;
	String name;
	public student(int n,String kaka)
	{
		id =n;
		name=kaka;
	}
	 public void Showdata()
	 {
		 System.out.println("ID :" +this.id  + "  Name:"+ this.name);
	 }
}

public class parameterized_constructors {

	
	public static void main(String[] args) {
		student obj=new student(2,"sHUKLA");
		obj.Showdata();
		student obj2=new student(9,"tARUN");
		obj2.Showdata();

	}

}
