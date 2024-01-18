package hInheritance;

class shape {
	float length, breadth , radius;
}

	class rectangle extends shape
	{
		 rectangle(int l, int b)
		 {
			 length = l;
			 breadth = b;
		 }
		 
		 float rectanglearea()
		 {
			 return length * breadth;
		 } 
	}
	
	class circle extends shape {
		
		circle(int r )
		{
			radius =r;
		}
		
		float circlearea()
		{
			return 3.14f *(radius*radius);
		}
	}
	
	class square extends shape
	{
		square(int a)
		{
			length = a;
		}
		
		float squarearea()
		{
			return length * length;
		}
		
	}

public class Hierarchical {

	public static void main(String[] args) {
	
		rectangle o1 = new rectangle(2,3);
		System.out.println("Area of Rectangle "+o1.rectanglearea());
		
		circle o2 = new circle(5);
		System.out.println("Area of square "+o2.circlearea());
		
		square o3 = new square((int)3.5);
		System.out.println("Area of square "+o3.squarearea());

	}

}
