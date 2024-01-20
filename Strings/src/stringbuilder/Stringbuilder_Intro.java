package stringbuilder;

public class Stringbuilder_Intro {

	public static void main(String[] args) {
		StringBuilder Builder=new StringBuilder(50);
		System.out.println(Builder.capacity());
        
		//
		String str="Bangalore";
		StringBuilder bui=new StringBuilder(str);
		// append
		System.out.println(bui.append("shukla"));
		// reverse
		System.out.println(bui.reverse());
		//delete
		System.out.println(bui.delete(3, 8));
		// changing the Default Size
		System.out.println();
		//exactly the same as the StringBuffer class only the 
		//difference is Synchronization and all all this are present in 
		//java.lang
		
		
		
		
	}

}
