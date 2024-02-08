package practice_set_1;

import java.util.Scanner;

public class Sumofall_number {
	public int Sum(String Abhi)
	{
		int sum=0;
		int Len=Abhi.length()-1;
		String tem="";
		for(int i=0;i<=Len;i++)
		{
			if(Character.isDigit(Abhi.charAt(i)))
			{
				tem=tem+Abhi.charAt(i);
			}
			else
			{
					//for(int j=0;j<tem.length();j++)
				if (!tem.isEmpty())
					sum=sum+Integer.parseInt(tem);
				    tem="";
			}
		}
		if(!tem.isEmpty())
		{
		sum=sum+Integer.parseInt(tem);
		tem="";
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Sumofall_number obj=new Sumofall_number();
		Scanner sc=new Scanner(System.in);
		String Abhi=sc.nextLine();
		System.out.println(obj.Sum(Abhi));

	}

}
