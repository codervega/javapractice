// Threads class in java are basically predefined class in 
//java.package and when ever any program is created in java 
// jvm automatically call the main thread class

package multhithreading;
class m1 extends Thread{
	public  void run(){
		System.out.println("the current thread name which is inside the"
				+ " run method is:  " +Thread.currentThread().getName());
	}
}

public class program_1 {

	public static void main(String[] args) {
		System.out.println("the current Thread name which "
				+ "inside the main method  is: "+Thread.currentThread().getName());
		m1 obj=new m1();
		obj.start();
	}

}
// in above program we have run method and start method
// so main thread method contain the run method which is overrident
// by the method run()--> custom run() method
// start method is basically used to start the execution of the 
// thread thread
