
public class try_catch {
    public static void m1(int num1,int num2)
    {
    	try {
    		int result=num1/num2;
    		System.out.println(result);
    	}
    	catch(Exception ae)
    	{
    		System.out.println(ae.getClass()+ "Exception handled "
    				+ "successfully");
    	}
    }
	public static void main(String[] args) {
		
		m1(10,0);
	}

}
