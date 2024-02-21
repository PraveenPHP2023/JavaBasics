package innerClass;



class outerClass
{
	static int a =10;
	int b =15;
	
	static class innerClass
	{
		void innerdisplay()
		{
		System.out.println("A: "+a);
		}
	}
}

public class StaticInnnerClass {

	public static void main(String[] args) {
		
		outerClass.innerClass obj = new outerClass.innerClass();
		obj.innerdisplay();
		
		

	}

}
