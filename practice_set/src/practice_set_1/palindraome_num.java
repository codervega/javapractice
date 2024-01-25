package practice_set_1;

import java.util.Scanner;


public class palindraome_num {
	public int reverse(int number)
	{
		int rev=0;
		int temp;
		while(number>0)
		{
			temp=number%10;
			rev=rev*10+temp;
			number=number/10;
		}
		return rev;
	}
	public void palindrome(int number)
	{
		if(reverse(number)==number)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int dig=sc.nextInt();
		palindraome_num obj=new palindraome_num();
		obj.palindrome(dig);
	}

}
