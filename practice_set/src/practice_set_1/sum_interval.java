package practice_set_1;

import java.util.Scanner;

public class sum_interval {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number till where the sum need "
				+ "to be found");
		int number=sc.nextInt();
		System.out.println("enter the interval");
		int interval=sc.nextInt();
		sum_interval obj=new sum_interval();
		System.out.println("The Sum is" +obj.sum_int(number,interval));
		
		

	}
	public int sum_int(int number,int interval)
	{
		int Sum=0;
		for(int i=1;i<=number;i=i+interval)
		{
		  Sum=Sum+i;	
		}
		return Sum;
	}

}
