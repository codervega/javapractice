package com.javalearning;

class lapton{
	int memorysize;
	String modelname;
	String modelcolor;
	
	public lapton(int size,String name,String color){
		memorysize=size;
		modelname=name;
		modelcolor=color;
	}
	public lapton(lapton obj)
	{
		memorysize=obj.memorysize;
		modelname=obj.modelname;
		modelcolor=obj.modelcolor;
	}
	public void showdetail(){
		System.out.println(memorysize+" "+modelname+" "+modelcolor);
	}
	
	
}
public class copy_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lapton obj=new lapton(2,"Abhishek","Shukla");
		obj.showdetail();
		lapton obj2= new lapton(obj);
		obj.showdetail();
	}

}
