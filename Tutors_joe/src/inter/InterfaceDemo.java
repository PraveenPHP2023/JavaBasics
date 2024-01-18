package inter;

interface Animal{
	void sound();
	abstract void sleep();
}

interface livingbeing{
	void breath();
	void eat();
}

// Multiple inheritance not support in java
// it is achieved by interfaces
class Dog implements Animal, livingbeing{ 

	@Override
	public void sound() {
	
		System.out.println("The Dog sounds like: woof");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
		
	}

	@Override
	public void breath() {
		
		System.out.println("Dog breath like humans");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Dog can also eat like humans");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Dog obj = new Dog();
		obj.breath();
		obj.eat();
		obj.sleep();
		obj.sound();
		
		
		

	}

}
