
public class catchwithreturn {
	public static void m1()
	{
		try {
			String Result=null;
			System.out.println( Result.length());
		}
		catch(Exception E)
		{
			System.out.println("handled successfully");
		}
	}
	public static void main(String[] args) {
		
		m1();
	}

}
