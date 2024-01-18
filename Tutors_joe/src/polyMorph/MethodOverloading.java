package polyMorph;

class Mathoperation
{
	static void multiply(int a )
	{
		System.out.println(a);
	}
	
	static int multiply(float a, int b)
	{
		int c = (int) a*b;
		return c;
	}
	
	static float multiply(double a, float b)
	{
		float c = (float)a*b;
		return c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
	System.out.println(Mathoperation.multiply(2.22, 3));	
	

	}

}
