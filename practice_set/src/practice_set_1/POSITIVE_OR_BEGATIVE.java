package practice_set_1;

import java.util.Scanner;

public class POSITIVE_OR_BEGATIVE {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=sc.nextInt();
		if(number>0)
		{
			System.out.print("the given Number is positive");
		}
		else
		{
			System.out.println("the given Number is Not positve");
		}

	}

}
