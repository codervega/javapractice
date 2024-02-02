package string_practice.com;

import java.util.Scanner;

public class check_alphabet {
	public void check(char a)
	{
		
		if((int)a>=65 && (int)a<= 91 ||(int)a<=98 && (int)a>=124)
		{
			System.out.println("The entered thing is an Alphabet");
		}
		else
		{
			System.out.println("It is Not an Alphabet");
		}
	}

	public static void main(String[] args) {
		char Abhi;
		System.out.print("Enter the thing");
		Scanner sc=new Scanner(System.in);
        Abhi=sc.next().charAt(0);
        check_alphabet obj=new check_alphabet();
        obj.check(Abhi);
        
	}

}
