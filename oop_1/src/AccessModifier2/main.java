package AccessModifier2;

import accessModifier.test;
import accessModifier.test_child;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj=new test();
		//System.out.println(obj.a);not possible to access
		System.out.println(obj.b);
		//System.out.println(obj.c); Not possible to access the 
		// varibale outside the project(private)
		
		// protected data can be only access inside the package But 
		// Not possible to access the package
		test_child obj1=new test_child();
		//System.out.println(obj1.d); not possible to access
		//outside the package that is protected only possible inside 
		// same class
		

	}

}
