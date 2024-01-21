package Abstraction;
abstract class Account{
	// creating an abstract method
	public abstract void salarycalculator();
	
	// creating concrete method
	public void companyName()
	{
		System.out.println("ABS");
	}
}
class FullTimeEmployee extends Account{
	public void salarycalculator() {
		System.out.println("Fulltime Salary :"+10000);
	}
}
class PartTimeEmployee extends Account{
	public void salarycalculator() {
		System.out.println("Fulltime Salary :"+10000);
	}
}

public class abstract_class {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee=new FullTimeEmployee();
		fullTimeEmployee.companyName();
		fullTimeEmployee.salarycalculator();
		
		System.out.println("------------------------------------");
		PartTimeEmployee PartTimeEmployee=new PartTimeEmployee();
		PartTimeEmployee.companyName();
		PartTimeEmployee.salarycalculator();

	}

}
