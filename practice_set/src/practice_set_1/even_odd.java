package practice_set_1;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the Number");
		number=sc.nextInt();
		if(number<=0)
		{
			System.out.println("Entered Number is not postive");
			
		}
		else
		{
			if(number%2==0)
			{
				System.out.println("Enter Number is Even");
			}
			else
			{
				System.out.println("entered Number is odd");
			}
		}

	}

}
