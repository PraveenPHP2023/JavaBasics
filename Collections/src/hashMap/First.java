package hashMap;

import java.util.HashMap;

public class First {

	public static void main(String[] args) {
		
		HashMap <String,String> cont = new HashMap <String,String> ();
		
		// put
		cont.put("India", "Delhi");
		cont.put("england", "london");
		cont.put("aus", "syd");  // ( key , values )
		
		System.out.println(cont);
		
		// remove
		// to remove we use values we use key to remove
		cont.remove("england");
		System.out.println(cont);
		
		// replace
		// to replace we use values we use key to replace
		cont.replace("aus", "syd", "queensland");
		System.out.println(cont);

	}

}
