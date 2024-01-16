package practice_set_1;

import java.util.Scanner;

public class finding_greatest_of_two_number {

	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number");
		number1=sc.nextInt();
		System.out.println("Enter The second Number");
		number2=sc.nextInt();
		if(number1>number2) {
			System.out.println(number1+ "is greater");
		}
		else
		{
			System.out.println(number2+ "is greater");
		}
		
		
		

	}

}
