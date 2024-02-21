package innerClass;

// Static blocks in java

class test{
	static {
		System.out.println("Test Block 1");
	}
	static {
		System.out.println("Test Block 2");
	}
	
}



public class StaticBlocks {
	
	static {
		System.out.println("Block 1");
	}

	public static void main(String[] args) {

		test obj = new test();
		System.out.println("Main Block");
		
		

	}
	
	static {
		System.out.println("Block 2");
	}

}
