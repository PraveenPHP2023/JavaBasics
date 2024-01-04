package multiLevelInherit;

public class Son extends Father {
	public void Education()
	{
		System.out.println("IT");
	}

	public static void main(String[] args) {
		// Multilevel Inheritance
		
		Son pravii = new Son();
		pravii.properties();
		pravii.vehicle();
		pravii.Education();
	}

}
