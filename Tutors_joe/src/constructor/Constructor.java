package constructor;

class Rectangle
{
	int length; int width;
	
	Rectangle()
	{
		System.out.println("Hi i am Constructor");
	}
	
	int area()
	{
		int a = length* width;
		return a;
	}
	
	
}
public class Constructor {

	public static void main(String[] args) {
		
		// Default constructor

		Rectangle o = new Rectangle();
		System.out.println(o.area());
	}

}
