package style3_programming;

public class Circle 
{
	public int radius = 0;
	public String color;
	public String outline;
	public String borderStyle ;
	public static double pi = 3.14;
	
	public Circle(String color,String outline ,String borderStyle,int radius)
	{
		this.borderStyle=borderStyle;
		this.outline=outline;
		this.color=color;
		this.radius=radius;
	}
	public void findArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area :"+area);
	}
	public void findCircumference()
	{
		double circumference = 2*pi*radius;
		System.out.println("Circumference :"+circumference);
	}
	public void findDiameter()
	{
		int diameter = 2*radius;
		System.out.println("Diameter :"+diameter);
		
	}
	public void display()
	{
		findArea();
		findCircumference();
		findDiameter();
		System.out.println("Circle is filled with "+color+" color");
		System.out.println("Outline "+outline+" color");
		System.out.println("Border Style is "+borderStyle);
		System.out.println("-----------------------------------");
		
	}
	
}
