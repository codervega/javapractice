package string_practice.com;

import java.util.Scanner;

public class check_voewl {
	public void check(String a)
	{
		if(a.equals("A") ||a.equals ("a")||a.equals("e")||a.equals("E")
				||a.equals("i")||a.equals("I")||a.equals("o")||a.equals("O")||
				a.equals("U")||a.equals("u"))
		{
			System.out.println("is vowel");
		}
		else{
			System.out.println("Not a Vowel");
		}
	}

	public static void main(String[] args) {
		String Abhi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		Abhi=sc.next();
		check_voewl Obj=new check_voewl();
		Obj.check(Abhi);
		

	}

}
