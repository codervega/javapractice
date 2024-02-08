package string_practice.com;

import java.util.Scanner;

//Calculate frequency of characters in a string 

public class frequencey_of_character {
	public int frequency(String Abhi,char ch)
	{
		int Count=0;
		int len=Abhi.length()-1;
		for(int i=0;i<=len;i++)
		{
			if(Abhi.charAt(i)==ch)
			{
				Count++;
			}
		}
		return Count;
		}

	public static void main(String[] args) {
		System.out.println("enter the String");
		Scanner sc=new Scanner(System.in);
		String Abhi=sc.nextLine();
		System.out.print("Enter the CHarcater: ");
		char ch=sc.next().charAt(0);
		frequencey_of_character obj=new frequencey_of_character();
		int f=obj.frequency(Abhi,ch);
		System.out.println(f);

	}

}
