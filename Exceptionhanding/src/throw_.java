//the throw statement in the java is used to creat
//a custom exception class


//let's try to understand the concept with an example
// here we have done a program which checks weather the person age 
// is greater than 18 or not,  if the age of the person is less than
// 18 then it will use of custom exception class object  will be created and
// throws exception as we can see in the program
// therefore throw keyword is used to create custom Exception class object.

class checkage extends Exception{
 String mes;
 public checkage(String mes) {
	 this.mes=mes;
 }
 public String print()
 {
	 return mes;
 }
}
public class throw_ {
	public static void eligible(int a)
	{
		if(a<18)
		{
			try {
				throw new checkage("you are not eligible ");
			}catch(checkage CE)
			{
				System.out.println(CE.print());
			}
		}
		
	}

	public static void main(String[] args) {
		eligible(2);
	}

}
