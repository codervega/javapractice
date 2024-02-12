
public class multiple_catch {
	public static void m1()
	{
		try {
			int abhi=10/0;
			String Abhi=null;
			System.out.println(Abhi.length());
		}
//		catch(ArithmeticException Ar)
//		{
//			System.out.println(Ar.getClass() +"the exception is handled successfully");
//		}
		catch(Exception Ab) {
			System.out.println(Ab.getClass()+ "Eception handled Successfully");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
	}

}
