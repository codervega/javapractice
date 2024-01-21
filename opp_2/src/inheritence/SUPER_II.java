package inheritence;
class base_1{
	int data=20;
}
class derived_1 extends base_1{
	int data=30;
	public void m1()
	{
		int data=40;
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}
}

public class SUPER_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived_1 obj=new derived_1();
		obj.m1();
	}

}
