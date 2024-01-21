package POLYMORPHISM;
class parents{
	public void m1()
	{
		System.out.println("called from parent class");
	}
}
class child extends parents{

	public void m1()
	{
		System.out.println("Called from child class");
	}
}



public class POLY_1 {
	public static void main(String[] args)
	{
		 child obj=new  child ();
		 obj.m1();
	}

}
