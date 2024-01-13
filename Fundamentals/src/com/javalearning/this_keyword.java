package com.javalearning;

class p
{
	public p() {
		System.out.println("the momory assined to "
				+ "this statement" +this.hashCode());
	}
}

public class this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hascode define integer represntation of an object
		p obj =new p();
		System.out.println("the memory assined to obj" + obj.hashCode());

	}

}
