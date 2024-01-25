package practice_set_1;

import java.util.Scanner;


public class Amstrong_number {
	public int count_1(int number)
	{
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		return count;
	}
	public int Ans(int number)
	{
		int value=count_1(number);
		int Sum=0;
		while(number>0)
		{
			int dig=number%10;
			number=number/10;
			Sum=Sum + (int) Math.pow(dig,value);
		}
		return Sum;

	}

	public static void main(String[] args) {
		int Number;
		System.out.println("enter the Number");
		Scanner sc=new Scanner(System.in);
		Number=sc.nextInt();
		Amstrong_number obj=new Amstrong_number();
		if(obj.Ans(Number)==Number)
		{
			System.out.println("it is an amstrong Number");
		}
		else
		{
			System.out.println("The Number is Not  an Amstrong Number");
		}
		
		
		
	}

}
