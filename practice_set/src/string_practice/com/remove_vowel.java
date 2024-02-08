package string_practice.com;

import java.util.Scanner;


public class remove_vowel {
	public String NewStr(String Abhi)
	{
		String S="";
		int len=Abhi.length()-1;
		for(int i=0;i<=len;i++)
		{
			if(Abhi.charAt(i)==('A')||Abhi.charAt(i)==('a')
					||Abhi.charAt(i)==('e')||Abhi.charAt(i)==('E')||
					Abhi.charAt(i)==('e')||Abhi.charAt(i)==('O')||
					Abhi.charAt(i)==('o')||Abhi.charAt(i)==('u')||
					Abhi.charAt(i)==('U')||Abhi.charAt(i)==('I')||Abhi.charAt(i)==('i'))
			{
				continue;
			}
			else
			{
				S=S+Abhi.charAt(i);
			}
		}
		return S;
	}

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String Abhi=sc.nextLine();
		remove_vowel obj=new remove_vowel();
		String k=obj.NewStr(Abhi);
		System.out.println(k);

	}

}
