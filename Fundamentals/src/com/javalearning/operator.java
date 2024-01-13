package com.javalearning;

class operator1{
	public void arthematic(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	public void logical(int a,int b)
	{
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	}
	public void bitwise(int a,int b)
	{
		System.out.println(a>>b); // left bitwise operator
		System.out.println(a<<b); // right bitwise operas
		
	}
}

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operator1 obj=new operator1();
		obj.arthematic(10, 20);
		obj.bitwise(10, 20);
		obj.logical(10,20);

	}

}
