package function;

public class First {
	
	public int Addition(int a , int b)
	{
		return a+b;
	}

	public int Subtraction(int a , int b)
	{
		return a - b;
	}
	
	public int Multiply(int a, int b)
	{
		return a*b;
	}
	
	public int division(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		

		First obj = new First();
		System.out.println(obj.Addition(1, 3));
		
		System.out.println(obj.Subtraction(10, 5));
		
		int multiply = obj.Multiply(10, 2);
		System.out.println(multiply);
		
		int divi = obj.division(25, 3);
		System.out.println(divi);
	}

}
