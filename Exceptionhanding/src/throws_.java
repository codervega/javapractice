// throws keyword
// throws" keyword is used to declare that a method might produce 
//certain types of exceptions during its execution. 
//It's like a warning sign that tells other parts of the program, 
//"Hey, this method could have some problems, so be prepared to handle them!

// let's try to understand the concept with an example
// it can be used for both custom exception class and as well as 
// for already existing exception class.

import java.sql.SQLException;
class eligible extends Exception{
	String message;
	public eligible(String Abhi)
	{
		this.message=Abhi;
	}
	public String eligiblee()
	{
		return message;
	}
}
public class throws_ {

	public static void check (int number)throws eligible
	{
		if(number<18)
		{
			try {
				throw new eligible("You are not eligible to vote");
			}
			catch(eligible ee)
			{
				System.out.println(ee.eligiblee());
			}
			finally {
				System.out.println("the Program is executed.....");
			}
		}
	}
	public static void main(String[] args) throws eligible {
		check(12);
	}

}
