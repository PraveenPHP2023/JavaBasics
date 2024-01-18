package dataAbstraction;

abstract class shape{
	abstract void draw();
	void message()
	{
		System.out.println("Message from shape");
	}
}

class rectangleshape extends shape{

	@Override
	void draw() {
		System.out.println("Draw Rectangle using length and breadth");
		
	}

	
		
		
	}
	


public class abstractionDemo {

	public static void main(String[] args) {
		
		rectangleshape obj = new rectangleshape();
		obj.draw();
		obj.message();
		

	}

}
