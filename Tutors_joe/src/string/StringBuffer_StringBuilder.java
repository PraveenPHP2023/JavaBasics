package string;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		StringBuffer obj = new StringBuffer("Praveen");
		System.out.println(obj);
		
		// append
		obj.append(" kumar");
		System.out.println(obj);
		
		// Insert
		obj.insert(13, " Bike");
		System.out.println(obj);
		
		//replace
		obj.replace(8, 13, "Divya");
		System.out.println(obj);
		
		// delete
		obj.delete(8, 14);
		System.out.println(obj);
		
		// reverse
		obj.reverse();
		System.out.println(obj);
		
		obj.reverse();
		System.out.println(obj);
		
		System.out.println(obj.charAt(2));
		
		System.out.println(obj.length());
		
		System.out.println(obj.substring(2));
		System.out.println(obj.substring(2, 7));
		
		// replace char 
		obj.setCharAt(0, 'p');
		System.out.println(obj);
		
		StringBuffer obj1 = new StringBuffer();
		System.out.println(obj1.capacity()); // default 16 capacity
		
		obj1.append("Hello java is my favourite language");
		System.out.println(obj1.capacity());
		

	}

}
