package string_practice.com;

import java.util.Scanner;

public class onlyAlphabet {
	public String Alpha(String Abhi)
	{
		//StringBuilder Str=new StringBuilder(Abhi);
		String A="";
		int len=Abhi.length()-1;
		for(int i=0;i<=len;i++)
		{
			if(Character.isLetter(Abhi.charAt(i)))
			{
				A=A+Abhi.charAt(i);
			}
			
		}
		return A;
		
		
	}

	public static void main(String[] args) {
       System.out.println("Enter The String");
       onlyAlphabet obj=new onlyAlphabet();
       Scanner sc=new Scanner(System.in);
       String Abhi=sc.nextLine();
       String Abh=obj.Alpha(Abhi);
       System.out.println(Abh);
       

	}

}
