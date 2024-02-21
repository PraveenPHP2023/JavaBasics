package innerClass;

abstract class testdemo{
	
	abstract void display();
}

class outerdemo {
	void outerdisplay()
	{
		testdemo o = new testdemo()
				{

					@Override
					void display() {
						
						System.out.println("Test Display");
						
					}
			
				};
				
				o.display();
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		

		outerdemo obj = new outerdemo();
		obj.outerdisplay();
	}

}
