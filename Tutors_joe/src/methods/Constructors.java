package methods;

class Rectangleshape
{
	int length, width;
	
	Rectangleshape()
	{
		System.out.println("Hi i am constructor");
		length = 2;
		width = 10;
	}
	
	int area()
	{
		int a = length* width;
		return a;
	}
}

public class Constructors {

	public static void main(String[] args) {
	 
		Rectangleshape o = new Rectangleshape();
		System.out.println("Area of rectangle: "+o.area());

	}

}
