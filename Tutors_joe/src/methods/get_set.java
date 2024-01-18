package methods;

class Shaperectangle {
	
	// 	Data Hiding getter and setter 
	
	private int length;
	private int width;
	
	// getter 
	int getlength()
	{
		return length;
	}
	
	int getwidth()
	{
		return width;
	}
	
	// setter
	void setlength(int length)
	{
		this.length =  length;
	}
	
	void setwidth(int width)
	{
		this.width = width;
	}
	
	
	int area ()
	{
		int a = length * width;
		return a;
	}
	
	
}
public class get_set {

	public static void main(String[] args) {
		// Data Hiding Getter and setter
		
		Shaperectangle o = new Shaperectangle();
		o.setlength(10);
		o.setwidth(20);
		
		System.out.println("Length "+o.getlength());
		System.out.println("Width "+o.getwidth());
		
		System.out.println(o.area());

	}

}
