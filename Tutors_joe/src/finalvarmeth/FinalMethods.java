package finalvarmeth;

class Super
{
	void display()
	{
		System.out.println("I am super display");
	}
	
	final void superdisplay() // we can override final methods in sub class
	{
		System.out.println("I am final super display");
	}
}

class sub extends Super
{
	void display()
	{
		System.out.println("I am sub display"); // method overriding
	}
	
	
}
public class FinalMethods {

	public static void main(String[] args) {
		// Final methods in java
		
		sub obj = new sub();
		obj.display();
		obj.superdisplay();

	}

}
