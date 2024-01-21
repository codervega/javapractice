package inheritence;

class A1{
	A1()
	{
		System.out.println("this is the first class");
	}
}

class B1 extends A1{
	B1()
	{
		this(10);
		System.out.println("this is the First method in class 2");
	}
	B1(int a)
	{
		super();
		System.out.println("this is the second class in B2");
	}
}

public class this_super {

	public static void main(String[] args) {
		B1 obj=new B1();
		

	}

}
