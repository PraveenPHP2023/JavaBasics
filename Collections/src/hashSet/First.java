package hashSet;

import java.util.HashSet;

public class First {

	public static void main(String[] args) {
		
		// In hashset we can access array list methods can't access linked list methods
		
	HashSet <String> color = new HashSet <String> ();
		
		color.add("Pink");
		color.add("yellow");
		color.add("orange");
		color.add("brown");
		
		System.out.println(color);
		
		// contains
		System.out.println(color.contains("yellow"));

	}

}
