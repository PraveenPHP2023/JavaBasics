package methods;

class Demo{
	
	private int m , n;
	
	Demo(int m , int n)
	{
		this.m = m;
		this.n = n;
	}
	
	int largest()
	{
		if(m>m)
		return m;
		else
			return n;
	}
	
	void display()
	{
		int large = largest();
		System.out.println("Largest number is "+large);
	}
}

public class NestingMethods {

	public static void main(String[] args) {
		// Nesting of methods
		
		Demo obj = new Demo(6,7);
		obj.display();

	}

}
