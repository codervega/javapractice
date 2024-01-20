package com.string;

public class stringmethods {

	public static void main(String[] args) {
		String str="java";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		//1. concat
		str=str.concat("world");
		System.out.println(str);
		System.out.println(str.hashCode());
		
		//2. length
		String Abhi="Abhishek Shukla";
		System.out.println(Abhi.length());
		
		// 3. charAt(index)
		System.out.println(Abhi.charAt(5));
		
		//4. indexOf(char)
		System.out.println(Abhi.indexOf('k'));
		
		//5 .lastIndexOf
		System.out.println(Abhi.lastIndexOf('a'));
		
		// 6.split
		String[] Shukla=Abhi.split(" ");
		for(String i:Shukla)
		{
			System.out.println(i);
		}
		// 7. toCharArray
		char[] Abhishek=Abhi.toCharArray();
		for(char i:Abhishek) {
			System.out.println(i);
		}
		
		// 8. subString
		System.out.println(Abhi.substring(3,8));
		
		// 9. equals 
		
		//== for comparing Physical Location
		
		

	}

}
