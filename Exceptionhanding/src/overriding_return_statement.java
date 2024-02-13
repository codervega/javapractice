// here point to be noted with regard to return statement 
// in try_catch and finally statement when ever there is a
// return statement in try block or in catch block or in 
// finally block then the return statement in the finally 
// block return override all the other block return and only 
// finally block return get executed
// try to analyze the code to understand the above topic
public class overriding_return_statement {
	public static int m1() {
		try {
			int abhi=10/0;
			
		}catch(ArithmeticException Ai)
		{
			return -1;
		}
		finally {
			return 0;
			// this is the reasean why final key word is 
			// not sugested to return any thing because it's 
			// return statement override all the other return 
			// statement.
		}
	}
	public static void main(String[] args) {
		System.out.println(m1());
	}

}
