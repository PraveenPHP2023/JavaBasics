package polyMorph;

class user
{
	String name;
	int age;
	
	user(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Mainprogrammer extends user{
	
	String companyname;
	
	Mainprogrammer(String name, int age, String companyname)
	{
		super(name, age);
		this.companyname = companyname;
		
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Companyname: "+companyname);
		
	}
	
}

public class MethodOverrirding {

	public static void main(String[] args) {
		
		Mainprogrammer obj = new Mainprogrammer("Praveen",27,"NCR");
		
			obj.display();
		

	}

}
