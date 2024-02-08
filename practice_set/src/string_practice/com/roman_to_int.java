package string_practice.com;

public class roman_to_int {
	public int value(char k)
	{
		if(k=='I')
		{
			return 1;
		}
		if(k=='V')
			return 5;
		if(k=='X')
			return 10;
		if(k=='L')
			return 50;
		if(k=='C')
			return 100;
		if(k=='D')
			return 500;
		if(k=='M')
			return 1000;
		
		return 0;
		}
	public int romantoint(String str)
	{ 
		
		
		int res=0;
		for(int i=0;i<str.length();i++)
		{
			int s1=value(str.charAt(i));
			if(i+1<str.length())
			{
				int s2=value(str.charAt(i+1));
				if(s1>=s2)
				{
					res=res+s1;
				}
				else
				{
					res=res+s2-s1;
				}
				
			}
			else {
				res=res+s1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		roman_to_int obj=new roman_to_int();
		System.out.println(obj.romantoint("XIX"));

	}

}
