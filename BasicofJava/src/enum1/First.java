package enum1;

public class First {
	
	enum Level{ // enum declaration
		easy,
		medium,
		hard
		
	}
	

	public static void main(String[] args) {
		
		Level med = Level.medium;
		Level eas = Level.easy;
		
		System.out.println(med);
		System.out.println(eas);
		

	}

}
