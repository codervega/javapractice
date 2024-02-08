package practice_set_1;

//Remove brackets from an algebraic expression 

public class BracketRemove {
	public String remove_bracket(String Abhi)
	{
		StringBuilder Abhishek=new StringBuilder();
		int len=Abhi.length()-1;
		for(int i=0;i<=len;i++)
		{
			if(Abhi.charAt(i)=='(' || Abhi.charAt(i)==')'
					||Abhi.charAt(i)=='}'||Abhi.charAt(i)=='{'
					||Abhi.charAt(i)=='['||Abhi.charAt(i)==']')
			{
				continue;
			}
			else
			{
				Abhishek.append(Abhi.charAt(i));
			}
		}
		return Abhishek.toString();
	}

	public static void main(String[] args) {
		String Abhi="{+ABHIS}[aBSH(IS)]";
		BracketRemove OBJ =new BracketRemove();
		String K=OBJ.remove_bracket(Abhi);
		System.out.println(K);

	}

}
