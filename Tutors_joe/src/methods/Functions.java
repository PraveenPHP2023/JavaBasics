package methods;

public class Functions {
	
	// No return without arguements
	
	public void add()
	{
		int a =110;
		int b = 70;
		System.out.println("Addition: "+(a+b));
	}
	
	// No return with arguements
	
	public void sub(int a, int b)
	{
		System.out.println("Subtraction: "+(a-b));
	}
	
	// Return without arguements
	
	public int multiply()
	{
		int a = 10;
		int b = 2;
		return a*b;
	}
	
	// Return with argueements
	
	public float division(int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
	
		Functions obj = new Functions();
		obj.add();
		
		obj.sub(10, 8);
		
		System.out.println("Multiplication: "+obj.multiply());
		
		int multiply = obj.multiply();
		
		System.out.println("Multiplication: "+multiply);
		
		
		System.out.println("Division: "+obj.division(22, 11)); 
	}

}
