package com.javalearning;
  
class employee{
	public  employee()
	{
		System.out.println("the is Now a constructor");
	}
	// If we add return type to a connstructor it start 
	// behaveing like a normal method and we have to call 
	// explicitly example
	
	public void Employee()
	{
		System.out.println("He Guys ");
	}
}
public class constructor_1 {

	public static void main(String[] args) {
		employee obj=new employee();
		obj.Employee();

	}

}
