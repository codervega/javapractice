package string_practice.com;

import java.util.Scanner;

// Program to Reverse the String
// This Program can also be done using String Builder Class
public class reverse {
	public String reverse(String Abhi)
	{
		String A="";
		int len=Abhi.length()-1;
		for(int i=len;i>=0;i--)
		{
			A=A+Abhi.charAt(i);
		}
		return A;
	}

	public static void main(String[] args) {
		System.out.println("Entrr the String");
		reverse obj=new reverse();
		//String Abhi=sc.nextLine();
		Scanner sc=new Scanner(System.in);
		String Abhi=sc.nextLine();
        String K=obj.reverse(Abhi);
        System.out.println(K);
	}

}
