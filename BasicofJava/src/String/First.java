package String;

public class First {

	public static void main(String[] args) {
	
		// CharAt()
		String color = "Pink is my favourite color Pink was so classic";
		char result = color.charAt(0);
		System.out.println(result);
		
		// Concat()
		String first = "Praveen ";
		String middle = "";
		String last = "Kumar";
		String Fullname = first.concat(last);
		System.out.println(Fullname);
		
		
		// Contains()
		System.out.println(first.contains("a")?"True":"False");
		System.out.println(first.contains("vee"));
		
		//indexof()
		System.out.println(color.indexOf("my"));
		
		// toUpperCase()
		System.out.println(last.toUpperCase());
		
		// toLowerCase()
		System.out.println(first.toLowerCase());
		
		//Length()
		System.out.println(Fullname.length());
		
		//isEmpty()
		System.out.println(first.isEmpty());
		System.out.println(middle.isEmpty());
		
		//replace()
		System.out.println(color.replace("Pink","white"));
		System.out.println(color);
		System.out.println(color.replaceFirst("Pink", "Black"));
	}

}
