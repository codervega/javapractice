package inheritence;

class praents{
	private int data=100;
	public int getdata() {
		return data;
	}
}
class child extends praents{
	private int childproperty=500;
	public int getchildproperty() {
		return childproperty;
	}
}

public class Single_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		System.out.print(obj.getchildproperty());
		

	}

}
