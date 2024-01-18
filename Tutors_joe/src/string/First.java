package string;

public class First {

	public static void main(String[] args) {
	
		String a ="Praveen Kumar";
		String b = "praveen";
		
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		
		
		System.out.println("A hashcode: "+a.hashCode());
		System.out.println("B hashcode: "+b.hashCode());
		
		System.out.println("Equals: "+a.equals(b));
		
		// Equals ignore case
		System.out.println("Equals ignore case: "+a.equalsIgnoreCase(b));
		
		// to get the length of thr string
		System.out.println(a.length());
		
		// to get a particular character in a string
		System.out.println(a.charAt(2));
		
		// upper case
		System.out.println("Uppercase: "+a.toUpperCase());
		
		// lowercase
		System.out.println("Lowercase: "+a.toLowerCase());

		// replace
		System.out.println("Replace: "+a.replace("Kumar", "Dhivya"));
		
		// contains
		System.out.println("Contains: "+a.contains("Kumar"));
		
		// empty
		System.out.println("Empty: "+a.isEmpty());
		
		// Endwith
		System.out.println("Endwith: "+a.endsWith("Kumar"));
		
		// StartsWith
		System.out.println("StartsWith: "+a.startsWith("Pra"));
		
		// Substring
		System.out.println("Substring: "+a.substring(3));
		
		// Substring no.of.characters
		System.out.println("Substring: "+a.substring(0,7));
		
		// We can print String into char array
		
		char [] c = a.toCharArray();
		
		for(char element:c)
		{
			System.out.print(element+" ");
		}
		
		System.out.println();
		String d = " praveen ";
		System.out.println("Length: "+d.length());
		
		// Trim
		System.out.println(d.trim());
		
		// Trim and Length
		System.out.println("Length: "+d.trim().length());
		
	}

}
