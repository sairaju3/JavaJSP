package style1_programming;

public class Circle 
{
	public int radius = 0;
	public static double pi = 3.14;
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		c1.radius=8;
		c2.radius=4;
		c3.radius=13;
		
		double area1 = pi*c1.radius*c1.radius;
		double area2 = pi*c2.radius*c2.radius;
		double area3 = pi*c3.radius*c3.radius;
		
		double circumference1 = 2*pi*c1.radius;
		double circumference2 = 2*pi*c2.radius;
		double circumference3 = 2*pi*c3.radius;
		
		int diameter1 = 2*c1.radius;
		int diameter2 = 2*c2.radius;
		int diameter3 = 2*c3.radius;
		
		System.out.println("-------------Circle 1 details-----------------");
		System.out.println("Area 1 "+area1);
		System.out.println("circumference1 "+circumference1);
		System.out.println("diameter1 "+diameter1);
		System.out.println("Circle 1 radius is "+c1.radius);
		
		System.out.println("-------------Circle 2 details-----------------");
		System.out.println("Area 2 "+area2);
		System.out.println("circumference 2 "+circumference2);
		System.out.println("diameter 2 "+diameter2);
		System.out.println("Circle 2 radius is "+c2.radius);
		
		System.out.println("-------------Circle 3 details-----------------");
		System.out.println("Area 3 "+area3);
		System.out.println("circumference 3 "+circumference3);
		System.out.println("diameter 3 "+diameter3);
		System.out.println("Circle 3 radius is "+c3.radius);
		
	}
}
