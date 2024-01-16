package practice_set_1;

import java.util.Scanner;

public class n_naturanl_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Number;
		System.out.println("Enter the Number");
		Number=sc.nextInt();
		int sum=Number*(Number+1)/2;
		System.out.println("the Sum of natural Number is "+sum);
		
		

	}

}
