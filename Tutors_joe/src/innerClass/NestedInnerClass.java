package innerClass;

class outer {
	int a =50;
	
		class inner
		{
			int b =25;
			
			void innerDisplay()
			{
				System.out.println("A: "+a); // we can access outer class variable from inner class
				System.out.println("B: "+b);
				
				
			}
		}
	
	void outerDisplay()
	{
	//	System.out.println("B: "+b); // we can access inner variable from outer class
		inner i = new inner(); 
		i.innerDisplay();
		System.out.println("B from inner class from outer display: "+i.b);
	}
}
public class NestedInnerClass {

	public static void main(String[] args) {
		
		outer obj = new outer();
		obj.outerDisplay();
		
		outer.inner o = new outer().new inner(); 
		o.innerDisplay();
		

	}

}
