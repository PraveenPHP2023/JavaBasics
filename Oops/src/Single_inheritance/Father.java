package Single_inheritance;

public class Father {
	public void Business()
	{
		System.out.println("Own Business");
	}
	public void vehicle()
	{
		System.out.println("Car");
	}

	public static void main(String[] args) {
		Father obj = new Father();
		obj.Business();

	}

}
