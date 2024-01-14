package accessModifier;

public class main {

	public static void main(String[] args) {
		test obj=new test();
		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c); not possible access outside of 
		//class
		test_child obj1=new test_child();
		System.out.println(obj1.d);

	}

}
