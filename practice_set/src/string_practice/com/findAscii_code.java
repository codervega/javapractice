package string_practice.com;

import java.util.Scanner;

public class findAscii_code {
	public int find(char A)
	{
		int value=(int)A;
		return value;
	}

	public static void main(String[] args) {
		System.out.println("enter the Alphabet or integer");
		Scanner sc=new Scanner(System.in);
		char Abhi=sc.next().charAt(0);
		findAscii_code obj=new findAscii_code();
		int k=obj.find(Abhi);
		System.out.println(k);

	}

}
