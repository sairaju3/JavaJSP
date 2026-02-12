package style4_programming;

public class Circle extends Shapes
{
	public int radius = 0;
	
	public static double pi = 3.14;
	
	public Circle(String color,String outlineColor ,String borderStyle,int radius)
	{
		super(color,outlineColor,borderStyle);
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
		displayShapeDetails();
		findArea();
		findCircumference();
		findDiameter();
		
		
	}
	
}
