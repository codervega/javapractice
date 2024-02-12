
public class test_catch_it {
	// method show if exception out side any try
	public static void m1() {
		String Abhi=null;
		System.out.println(Abhi.length());
		try {
			int ab=10/0;
		}
		catch(Exception ae)
		{
			System.out.println("the exception is handled very successfully");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
