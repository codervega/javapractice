package string_practice.com;

//Capitalize the first and last character of each word of a string 

public class capa_f_l_w {
	public String ans(String Abhi)
	{
		Abhi=Abhi.trim();
		String[] Word=Abhi.split("");
		StringBuilder newAbhi=new StringBuilder(Abhi);
		for(String word:Word)
		{
			if(word.length()>1)
			{
				newAbhi.append(Character.toUpperCase(word.charAt(0)));
				newAbhi.append(word.substring(1,word.length()-1));
				newAbhi.append(Character.toUpperCase(word.charAt(word.length()-1)));
				newAbhi.append("");
			}
			else
			{
				newAbhi.append(word.toUpperCase()).append("");
			}
			
		}
		return newAbhi.toString();
		
	}

	public static void main(String[] args) {
		capa_f_l_w obj=new capa_f_l_w();
		String A="Abhishek shukla";
		System.out.println(obj.ans(A));

	}

}
