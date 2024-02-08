package string_practice.com;

// 	Remove spaces from a string 

import java.util.Scanner;

public class WhiteSpace_remove {
	public String whiteSpace(String Abhi)
	{
		StringBuilder Abhishek=new StringBuilder();
		int len=Abhi.length()-1;
		for(int i=0;i<=len;i++)
		{
			if(Character.isWhitespace(Abhi.charAt(i)))
			{
				continue;
			}
			else
			{
				Abhishek.append(Abhi.charAt(i));
			}
			
		}
	   return Abhishek.toString();
	   
	}

	public static void main(String[] args) {
		System.out.println("Enter The String");
		WhiteSpace_remove obj=new WhiteSpace_remove();
	       Scanner sc=new Scanner(System.in);
	       String Abhi=sc.nextLine();
	       String Abhis=obj.whiteSpace(Abhi);
	       System.out.println(Abhis);

	}

}
