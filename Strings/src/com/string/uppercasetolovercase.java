package com.string;

import java.util.Scanner;

public class uppercasetolovercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		uppercasetolovercase obj=new uppercasetolovercase ();
		System.out.print("Enter the String");
		String Abhi=sc.next();
		String Abhi1=sc.next();
		//obj.uptolow(Abhi);
		obj.lowtoup(Abhi1);
	}
	public void uptolow(String Abhi)
	{
		int i;
		int len=Abhi.length()-1;
		for(i=0;i<=len;i++)
			{
				int value=65+((int)Abhi.charAt(i)-65);
				int cha=32+value;
				System.out.print((char)cha);
			}
		
	}
	public void lowtoup(String Abhi1)
	{
		int i;
		int len=Abhi1.length()-1;
		for(i=0;i<=len;i++)
		{
			int value=Abhi1.charAt(i);
			int cha=value-32;
			System.out.print((char)cha);
		}
	}

}
