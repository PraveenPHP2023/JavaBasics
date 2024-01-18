package methods;

class rectangle {
	
	int length;
	int width;
	
	void getdet(int x, int y)
	{
		length = x;
		width = y;
	}
	
	int area ()
	{
		int a = length * width;
		return a;
	}
}

public class Class_object {

	public static void main(String[] args) {
		
		
		rectangle o =  new rectangle();
		
		o.length = 10;
		o.width = 20;
		
		System.out.println("Area of Rectangle: "+o.area());
		
		rectangle o1 = new rectangle();
		o1.getdet(10, 30);
		
		System.out.println("Area of Rectangle: "+o1.area());

	}

}
