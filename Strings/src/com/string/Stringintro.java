package com.string;

public class Stringintro {

	public static void main(String[] args) {
	   // first method using literals
		String str="JAVA";
		System.out.println(str);
		String str1="jAVA";
		
		// second method using the new keyword
		String str2=new String("Javaworld");
		System.out.println(str2);
		String str3=new String("Javaworld");
		System.out.println(str3);
		
		if(str1==str)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal To");
		}
		if(str2==str3)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal To");
		}

	}

}
