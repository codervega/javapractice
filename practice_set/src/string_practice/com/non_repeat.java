package string_practice.com;

import java.util.Scanner;

//Find non-repeating characters in a string 

public class non_repeat {
	public String repeat_character(String Abhi)
	{
	  StringBuilder newstring=new StringBuilder();
	  
	  for(int i=0;i<=Abhi.length()-1;i++)
	  {
		 char currentchar=Abhi.charAt(i);
		 
		 
		 if(!Character.isWhitespace(currentchar))
		 {
			 boolean repeat=false;
			 for(int j=0;j<Abhi.length();j++)
				{
					if(i!=j && Abhi.charAt(j)==currentchar)
					{
						repeat=true;
						break;
					}
					
				}
			 if(!repeat)
				{
					newstring.append(currentchar);
					newstring.append(",");
				}
			 
		 }	 
		 
	}
	  return newstring.toString();
	}
	

	public static void main(String[] args) {
		non_repeat obj=new non_repeat();
		System.out.println("enter the String");
		Scanner sc=new Scanner(System.in);
		String Abhi=sc.nextLine();
		System.out.println(obj. repeat_character(Abhi));
		
	}

}
