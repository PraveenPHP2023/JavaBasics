package arrayList;

import java.util.ArrayList;

public class First {

	public static void main(String[] args) {
		
ArrayList <String> color =  new ArrayList <String> ();
		
		//Add
		color.add("Pink");
		color.add("yellow");
		color.add("orange");
		color.add("brown");
		
		// set
		color.set(1, "white");
		
		// remove
		color.remove(2);
		
		System.out.println(color);
		
		// get
		System.out.println(color.get(0));

	}

}
