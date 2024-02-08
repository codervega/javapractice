package string_practice.com;

import java.util.Scanner;

public class coun_vowelst {
	public int now(String Abhi)
	{
		//String newStr="";
		int count=0;
		int len=Abhi.length()-1;
		for(int i=0;i<=len;i++)
		{
			if(Abhi.charAt(i)==('A')||Abhi.charAt(i)==('a')
					||Abhi.charAt(i)==('e')||Abhi.charAt(i)==('E')||
					Abhi.charAt(i)==('e')||Abhi.charAt(i)==('O')||
					Abhi.charAt(i)==('o')||Abhi.charAt(i)==('u')||
					Abhi.charAt(i)==('U')||Abhi.charAt(i)==('I')||Abhi.charAt(i)==('i'))
			{
				count=count+1;
			}
			else
			{
				continue;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String Abhi=sc.nextLine();
		coun_vowelst obj=new coun_vowelst();
		int k=obj.now(Abhi);
		System.out.println(Abhi.length());
		System.out.println(k);
		

	}

}
