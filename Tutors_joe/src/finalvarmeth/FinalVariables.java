package finalvarmeth;

class Test {
	final int Min = 1; // direct initialization
	final int normal ; 
	final int maximum;
	
	Test(int normal) // constructor initialization
	{
		this.normal = normal;
		maximum = 100;
	}
	
	void display ()
	{
		System.out.println("MIN: "+Min);
		System.out.println("Normal: "+normal);
		System.out.println("MAX: "+maximum);
	}
}

public class FinalVariables {

	public static void main(String[] args) {
		
		// Final variables in java
			Test obj = new Test(25);
			obj.display();

	}

}
