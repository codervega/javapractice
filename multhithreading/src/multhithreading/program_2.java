// runnable approch to creat the thread

package multhithreading;

class t1 implements Runnable{
	public void run()
	{
		System.out.println("the current thread in the run method"
				+ "is "+Thread.currentThread().getName());
		
	}
}
public class program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the current thread inside the main method is "
				+ Thread.currentThread().getName());
		 t1 obj=new t1();
		 Thread obj2=new Thread(obj);
		 obj2.start();
	}

}
