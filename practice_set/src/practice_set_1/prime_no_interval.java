package practice_set_1;

import java.util.Scanner;

public class prime_no_interval {
	int count;
	
	public void inte(int num_str,int num_end)
	{
	   for(int i=num_str;i<=num_end;i++) {
		   boolean isprime=true;
		  for(int j=2;j<i;j++)
		  {
			  if(i%j==0)
			  {
				  isprime=false;
				  break;
			  }
		  }
		  if(isprime)
		  {
			  count++;
			  System.out.println(i+ " ");
		  }
		   
	   }
	   System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime_no_interval obj=new prime_no_interval();
		Scanner sc=new Scanner(System.in);
		int number_start;
		int number_end;
		System.out.println("Enter the first Number");
		number_start=sc.nextInt();
		System.out.println("enter the end number");
		number_end=sc.nextInt();
		obj.inte(number_start,number_end);
	}

}
