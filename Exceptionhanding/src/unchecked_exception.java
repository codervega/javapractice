
public class unchecked_exception {
//	public static void m1()
//	{
//		int a=10;
//		int b =0;
//		int result=a/b;
//		System.out.println(result);
//		
//	}
//	public void m2()
//	{
//		//Number format exception
//		String Abhi="123Abhh";
//		System.out.println(Integer.parseInt(Abhi));
//	}
	public void m3()
	{
		//OutofBound Exception
		 // array index out of bound
		int[] arr= {1,2,4,5};
		System.out.println(arr[5]);
		//StringIndex Out of box exception
		String ABhi="Abhishek Shukla";
		System.out.println(ABhi.charAt(150));
		// nullPointer Exception
		String King=null;
		System.out.println(King.length());
		
	}
	public static void main(String[] args) {
		unchecked_exception obj =new unchecked_exception();
		//obj.m1();
		//obj.m2();
		obj.m3();

	}

}
