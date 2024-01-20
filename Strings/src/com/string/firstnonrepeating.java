package com.string;

import java.util.Scanner;

public class firstnonrepeating {

	public static void main(String[] args) {
		firstnonrepeating obj=new firstnonrepeating();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(obj.check(str));

	}
	public char check(String str)
	{
		char re='z';
		int i,j;
		int len=str.length()-1;
		for(i=0;i<=len-1;i++)
		{
			char first=str.charAt(i);
			for(j=i+1;j<len;j++)
			{
				if(first!=str.charAt(j)) {
					re=first;
					break;
				}
			}
		break;	 
		}
		return re;
		
	}
	

}
