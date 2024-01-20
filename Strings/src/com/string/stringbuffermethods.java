package com.string;

public class stringbuffermethods {

	public static void main(String[] args) {
		//StringBuffer Methods:
		//1.append()
		String str="Abhishek";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb);
		System.out.println(sb instanceof StringBuffer);
		
		//length()
		System.out.println(sb.length());
		
		//charAt()
		System.out.println(sb.charAt(5));
		
		//delete
		System.out.println(sb.delete(2,6));
		
		// reverse
		System.out.println(sb.reverse());
	}

}
