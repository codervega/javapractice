package inheritence;
class name {
	private String name="Abhishek";
	public String Name(){
		return this.name;
	}
}
class Surname extends name{
	private String surname="Shukla";
	public String Sname() {
		String N=this.Name();
		return N+" "+this.surname;
	}
}
class profile extends Surname{
	private String role="Java Developer";
	public String student() {
		String N=this.Sname();
		return N+" "+role;
	}
}
public class multi_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		profile pd=new profile();
		System.out.println(pd.student());
		

	}

}
