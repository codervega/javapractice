package practice_set_1;

import java.util.Scanner;

public class sum_od_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit");
		int dig=sc.nextInt();
		int rev=0;
		int temp;
		while(dig>0) {
			temp=dig%10;
			rev=rev*10+temp;
			dig=dig/10;
		}
		System.out.println(rev);

	}

}
