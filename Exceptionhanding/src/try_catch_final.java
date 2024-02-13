// what is now finally key word
// finally keyword is basically used to execute the code even if the
// try catch is executed or not but then too it execute the 
// code written inside the try finally keyword.
public class try_catch_final {
	public static void m1()
	{
		try {
			int rsult=10/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("the exception is handled successfully");
		}
		finally {
			System.out.println("We are in the finally block");
		}
		System.out.println("out of try_catch_finally keywords");
	}

	public static void main(String[] args) {
		m1();

	}

}
