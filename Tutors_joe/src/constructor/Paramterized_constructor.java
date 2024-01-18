package constructor;

class box{
	
	float length , breadth;
	
	box() // default constructor
	{
		length = 2;
		breadth = 5;
	}
	
	box(float x, float y) // parameterized constructor
	{
		length = x;
		breadth = y;
	}
	
	box(float x) // Paramterized constructor
	{
		length = breadth = x;
	}
	
	float area()
	{
		return length* breadth;
	}
}

public class Paramterized_constructor {

	public static void main(String[] args) {
	
		box o = new box();
		System.out.println(o.area());
		
		box o1 = new box(3);
		System.out.println(o1.length);
		System.out.println(o1.breadth);
		System.out.println(o1.area());
		
		box o2 = new box(2,6);
		System.out.println(o2.length);
		System.out.println(o2.breadth);
		System.out.println(o2.area());
		
		

	}

}
