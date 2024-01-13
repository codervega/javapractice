package controlstatement;

import java.util.Scanner;

public class do_while {
	public static void m1()
	{
		System.out.print("Method m1 Is exccuted");
	}
	public static void m2()
	{
		System.out.println("Method Two is been Executed");
	}
	public static void m3()
	{
		System.out.println("Method three is been Executed");
	}

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey Forks Welcome ");
		do{
		System.out.println("enter Your option Among all this");
		System .out.println("***********1*********");
		System .out.println("***********2*********");
		System .out.println("***********3*********");
		int option =sc.nextInt();
		switch (option)
			{
			case 1:m1();
			      break;
			case 2:m2();
			      break;
			case 3:m3();
			      break;
			}
		System.out.println("Do u want to continie");
		System.out.println("Enter 'Y' if yes");
		 ch=sc.next().charAt(0);
			
		}
		while(ch=='Y');
	}

}
