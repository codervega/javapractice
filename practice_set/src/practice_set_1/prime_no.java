package practice_set_1;

import java.util.Scanner;

public class prime_no {
	public int prime(int number) {
		
		if(number==1 || number==0)
		{
			return 0;
		}
		else {
			for(int i=2;i<number;i++)
			{
				if(number%i==0) {
					return 0;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime_no obj=new prime_no();
		Scanner sc=new Scanner(System.in);
		int number;
		number=sc.nextInt();
		System.out.println(obj.prime(number));

	}

}
