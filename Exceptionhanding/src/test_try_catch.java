// point to be noted that if nested try catch is present and if u
// have not defined that catch statement in nested try catch then to
// the outer try catch will solve the issue as inside the outer try catch

public class test_try_catch {
	public static void m1()
	{
		try {
			int result=10/4;
			try {
				String Abhi=null;
				System.out.println(Abhi.length());
			}
			catch(NullPointerException an)
			{
				System.out.println("We are inside the nested catch ");
			}
		}catch(ArithmeticException aa)
		{
			System.out.println("We are in outer catch");
		}
	}

	public static void main(String[] args) {
		m1();
	}

}

