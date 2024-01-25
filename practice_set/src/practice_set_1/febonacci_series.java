package practice_set_1;

import java.util.Scanner;

public class febonacci_series {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		int first=0;
		int second=1;
		System.out.print(first+ " " +second);
		int term=0;
		for(int i=0;i<number;i++)
		{
			
			 term=first+second;
			first=second;
			second=term;
        	System.out.print(" "+term);
			
		}
		
	}

}
