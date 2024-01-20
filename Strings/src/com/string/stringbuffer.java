package com.string;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer();
		buffer.append("java");
		System.out.println(buffer);
		System.out.println(buffer.hashCode());
		
		//mutable
		buffer.append("World");
		System.out.println(buffer);
		System.out.println(buffer.hashCode());
		
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.append("abcdefghijklqhiuiooljh");
		System.out.println(sb2.capacity());
		
		// changing capacity manually
		StringBuffer sb3=new StringBuffer(20);
		System.out.println(sb3.capacity());
		
		
		

	}

}
