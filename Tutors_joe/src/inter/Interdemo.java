package inter;

interface interdem{
	int a = 25; // final static int a =25; // i acts a final variable or constant
	
	void fun1(); // by default it acts a public abstract void fun1
	void fun2();
	
	public static void fun3() // we can use static method inside the interfaces
	{
		System.out.println("I am fun-3");
	}
	
	default void fun5()
	{
		System.out.println("Fun-5");
	}
}

interface interdem2 extends interdem {
	
	void fun4();
}

class tester implements interdem2{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun4() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


public class Interdemo {

	public static void main(String[] args) {
		
		System.out.println("A :"+interdem.a);
		interdem.fun3();
		
	}

}

