package innerClass;

class staticTest{
	static int a =20;
	int b =100;
	
	void show()
	{
		System.out.println("A: "+a +" "+"B: "+b); 
	}
	
	static void display()
	{
		System.out.println("A: "+a);
		
	}
}
public class Static_vari_methods {

	public static void main(String[] args) {
	
		staticTest a1 = new staticTest();
		a1.show();
		
		a1.b = 29;
		a1.show();
		
		staticTest a2 = new staticTest();
		a2.b = 27;
		a2.show();
		
		a2.a = 100;
		
		a1.show();
		a2.show();

	}

}
