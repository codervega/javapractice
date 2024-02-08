package string_practice.com;

import java.util.Scanner;

public class toggle {
	public String Strtig(String str)
	{
		int len=str.length()-1;
		String S="";
		for(int i=0;i<=len;i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				S=S+Character.toLowerCase(str.charAt(i));
			}
			else
			{
				S=S+Character.toUpperCase(str.charAt(i));
			}
		}
		return S;
	}

	public static void main(String[] args) {
		String Abhi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		Abhi=sc.next();
		toggle obj=new toggle();
		System.out.println(obj.Strtig(Abhi));
		

	}

}
