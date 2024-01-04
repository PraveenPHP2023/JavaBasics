package override;

public class Dog extends Cat {
	public void animal()
	{
		System.out.println("Dog is a Animal");
	}

	public static void main(String[] args) {
		
		Cat obj = new Cat();
		obj.animal();
		
	}

}
