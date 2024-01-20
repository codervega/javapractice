package practice_set_1;

import java.util.Scanner;

public class leap_year {
	public void leap(int year)
	{
		if((year%4==0)||(year%4==0 && year%100!=0)) {
			System.out.println("year is leap year");
		}
		else
		{
			System.out.println("year is not leap year");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leap_year obj=new leap_year();
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the year");
		year=sc.nextInt();
		obj.leap(year);
		
	}
	

}
