package Abstraction;

interface vehicle{
	int speed();
	
	public default void Numberofwheels()
	{
		System.out.println("there totally 4 wheels" +4);
	}
	public static void brandname()
	{
		System.out.println("Tata_motors");
	}
	
	
}
class Car implements vehicle{
	public int speed() {
		return 120;
	}
}

public class interface_1 {

	public static void main(String[] args) {
		Car car=new Car();
		System.out.println(car.speed());
		car.Numberofwheels();
	}

}
