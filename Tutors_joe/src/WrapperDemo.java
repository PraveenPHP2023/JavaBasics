import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		// Wrapper Class
		
		int i=10; // premitive 
		
		Integer i2 = Integer.valueOf(i); // Boxing or Wrapping
		
		int j = i2.intValue(); // unboxing
		
		System.out.println(j);
		
		Integer i3 = i; // Integer i3 = Integer.valueOf(i) // Autoboxing
		
		int k = i2; // AutoUnboxing
		System.out.println(k);
		
		String s = "123";
		
		int s1 = Integer.parseInt(s); // String to Integer
		
		System.out.println(s1);
		
		
		
	}

}
