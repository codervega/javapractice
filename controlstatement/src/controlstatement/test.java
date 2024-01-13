package controlstatement;

import java.util.Scanner;

class DB{
	String username="Abhishek";
	String realpassword="Abhi@123";
	
}

class loginsystem{
	
	String user;
	String password;
	
	public loginsystem(String user,String password) {
		this.user=user;
		this.password=password;
	}
	
	public void check() {
		DB obj=new DB();
		if(user.equals(obj.username)) {
			if(password.equals(obj.realpassword)) {
				System.out.println("Welcome");
			}
			else {
				System.out.println("Word password");
			}
		}
		else {
			System.out.println("Not valid name");
		}
	}
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name");
		String user=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
      loginsystem obj1=new loginsystem(user,password);
      
      obj1.check();
	}

}
