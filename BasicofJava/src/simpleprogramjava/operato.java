package simpleprogramjava;

public class operato {

	public static void main(String[] args) {
		// comparison operator or relational operators
		
		int x = 86;
		int y = 86;
		
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		
		// Logical Operators
		
		System.out.println((x==y)&&(x<y));
		System.out.println((x==y)||(x<y));
		System.out.println(!((x==y)&&(x<y)));
		

	}

}
