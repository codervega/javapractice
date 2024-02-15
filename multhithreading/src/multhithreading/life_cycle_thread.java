package multhithreading;

public class life_cycle_thread extends Thread{
	public void run()
	{
		// Running state
		System.out.println("task has started");
		// blocked
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("the finished");// dead
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		life_cycle_thread  t1=new life_cycle_thread (); //new
		t1.start(); // runnable

	}

}
