package innerClass;

class outercls
{
	void display()
	{
		// Scope of the inner class will be inside this method we cant call inner class from main method
		class innercls
		{
			
			void innerDisplay()
			{
				System.out.println("Inner Display");
			}
		}
		
		innercls i = new innercls();
		i.innerDisplay();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		
		outercls obj = new outercls();
		obj.display();
		
		
		

	}

}
