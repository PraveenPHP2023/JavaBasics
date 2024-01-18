package inter;

interface demo{
	int a = 20;
	void display();
	default void message()
	{
		
	}
	
	public static void message1()
	{
		
	}
}

public class Practice {

	public static void main(String[] args) {
		
		int a = demo.a;
		System.out.println(a);

	}

}
