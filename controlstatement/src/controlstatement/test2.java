package controlstatement;

import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
	 System.out.println("The Number");
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 test2 obj=new test2();
	 System.out.println(obj.ans(a));
	 
  }
  public int ans(int a)
  {
	  int ans=0;
	  while(a!=0)
	  {
		  int temp=a%10;
		  ans=ans+temp;
		  a=a/10;
	  }
	  return ans;
  }

}
