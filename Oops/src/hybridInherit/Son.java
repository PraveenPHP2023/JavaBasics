package hybridInherit;

public class Son extends Father{
	public void job()
	{
		System.out.println("I got a good job");
	}

	public static void main(String[] args) {
		
		Son p = new Son();
		p.job();
		p.properties();
	}

}
