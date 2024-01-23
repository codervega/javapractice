package project_1;

import java.util.Scanner;


class bankingapp{
	int amount;
	int withd;
	static int balance=500;
	
	Scanner sc=new Scanner(System.in);
	public void deposite()
	{
		System.out.println("Enter the Amount you want to enter");
		amount=sc.nextInt();
		balance=balance+amount;
		System.out.println("the amount in the bank is "+balance);
		
	}
	public void withdraw()
	{
		System.out.print("enter the Amount you want to Withdraw");
		withd=sc.nextInt();
		if(balance<=500)
		{
			System.out.println("Sorry ,YOu can Not withdraw ");
		}
		else {
			balance=balance-withd;
			if(balance<=500) {
				System.out.println("you can withdraw");
				
			}
			else
			{
				System.out.println("the balance remaning is "+no);
			}
		}
	}
	public void enqueiry()
	{
		System.out.println("1.check balance\t\t2.bank name\t\t3.branch");
		int opt=sc.nextInt();
		switch(opt)
		{
		case 1:System.out.print(balance);
				break;
		case 2:System.out.print("BANK OF ALKAIDA");
				break;
		case 3:System.out.println("Branch OF Afganistan");
				break;
		default:System.out.println("Enter a valid input");
				break;
		}
	}
}

public class p1 {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		char new_choice;
		do {
			int choice;	
		     System.out.println("Hello forks");
		     System.out.println("Enter the choice ammong this");
		     System.out.println("1.desposite\n2.withdraw\n3.Enquire");
		     
		     choice=sc.nextInt();
		     bankingapp work=new bankingapp();
		     switch(choice) {
		     case 1: work.deposite();
		             break;
		     case 2: work.withdraw();
		             break;
		     case 3: work.enqueiry();
		             break;
		     default:System.out.println("invalid option");
		     }
		     System.out.println("Press S if you want to continue the process");
			 new_choice=sc.next().charAt(0);
		}
		while(new_choice=='s');
	    	}

}
