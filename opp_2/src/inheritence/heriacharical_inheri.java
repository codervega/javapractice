package inheritence;
class parent{
	private int year=10;
	public int Number(){
		return year;
	}
}
class children extends parent{
	private int salary=10000;
	public int Nowsalary() {
		int Current=this.Number();
		return salary*Current;
	}
}
class children2 extends parent{
	private int life=100;
	public int remaininglife() {
		int present=this.Number();
		return (life-present);
	}
}
public class heriacharical_inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        children ch=new children();
        children2 ch1=new children2();
        System.out.println(ch.Nowsalary());
        System.out.println(ch1.remaininglife());
        
	}

}
