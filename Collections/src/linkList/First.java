package linkList;

import java.util.LinkedList;

public class First {

	public static void main(String[] args) {
		
		LinkedList <String> color = new LinkedList <String> ();
		
		color.add("Pink");
		color.add("yellow");
		color.add("orange");
		color.add("brown");
		
		System.out.println(color);
		
		// addFirst
		color.addFirst("White");
		System.out.println(color);
		// addLast
		color.addLast("Black");
		System.out.println(color);
		// removeFirst
		color.removeFirst();
		System.out.println(color);
		// removeLast
		color.removeLast();
		
		
		System.out.println(color);
	}

}
