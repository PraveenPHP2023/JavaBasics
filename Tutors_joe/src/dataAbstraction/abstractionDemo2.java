package dataAbstraction;

abstract class Mobile{
	void voicecall()
	{
		System.out.println("You can make voicecall");
	}
	
	abstract void display();
	abstract void camera();
}

class samsung extends Mobile{

	@Override
	void display() {
	
		System.out.println("You can have LCD display in samsung");
		
	}

	@Override
	void camera() {
		System.out.println("You can have 12 megapixel in samsung");
		
	}
	
}

class Nokia extends Mobile{

	@Override
	void display() {
		System.out.println("You can have LED Gorilla class display in nokia");
		
	}

	@Override
	void camera() {
		System.out.println("You can have 8 mega pixel camera in nokia");
		
	}
	
}

public class abstractionDemo2 {

	public static void main(String[] args) {
		
		samsung obj = new samsung();
		obj.camera();
		obj.display();
		obj.voicecall();
		
		System.out.println("------------------------------------------------------------------");
		
		Nokia obj1 = new Nokia();
		obj1.camera();
		obj1.display();
		obj.voicecall();
		
		
		

	}

}
