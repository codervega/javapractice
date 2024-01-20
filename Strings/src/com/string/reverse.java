package com.string;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		reverse obj=new reverse();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String abhi=sc.next();
		obj.shukla(abhi);
	}
	public void shukla(String a) {
	     int len=a.length()-1;
	     int i;
	     for(i=len;i>=0;i--)
	     {
	    	 System.out.print(a.charAt(i));
	     }
	}

}
