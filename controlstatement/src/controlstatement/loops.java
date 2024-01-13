package controlstatement;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		 int digit,power;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the numhber who's Power need to be find");
		 digit=sc.nextInt();
		 System.out.println("Enter the Power");
		 power=sc.nextInt();
		loops obj=new loops();
		System.out.println(obj.check(digit,power));

	}
	public int check(int digit,int pow)
	{
		int answer=1;
		for(int i=0;i<pow;i++)
		{
			answer=answer*digit;
		}
		return answer;
		
	}

}
