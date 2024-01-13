package com.javalearning;

public class variable_1 {
    int data=1;
	public static void main(String[] args) {
	
     variable_1 obj=new variable_1();
     variable_1 obj1=new variable_1();
     System.out.print(obj.data);
     
     System.out.println("Before Updation----");
     System.out.println(obj.data);
     System.out.println(obj1.data);
     
     obj1.data=100;
     
     System.out.println("After the updation---");
     System.out.println(obj.data);
     System.out.println(obj1.data);

     
     
     
	}

}
