package Encapsulation;
class Abhishek{
	private int Abhi;
	public void setAbhi(int A)
	{
		this.Abhi=A;
	}
	public int getAbhi()
	{
		return this.Abhi;
	}
}

public class setter_getter {

	public static void main(String[] args) {
		Abhishek obj=new Abhishek();
		obj.setAbhi(10);
		System.out.println(obj.getAbhi());

	}

}
