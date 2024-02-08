package string_practice.com;

import java.util.Scanner;

//Check if the given string is Palindrome or not 

public class palindrome {
	
	public boolean palindrome(String Abhi)
	{
		String s="";
		int len=Abhi.length()-1;
		for(int i=len;i>=0;i--)
		{
			s=s+Abhi.charAt(i);
		}
		if(Abhi.equals(s))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Entrr the String");
		palindrome obj=new palindrome();
		//String Abhi=sc.nextLine();
		Scanner sc=new Scanner(System.in);
		String Abhi=sc.nextLine();
		if(obj.palindrome(Abhi)==true)
		{
			System.out.println("The String Enter is a Palindrome");
		}
		else
		{
			System.out.println("String Entered is not a Palindrome");
		}
		

	}

}
