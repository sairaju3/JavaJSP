package style2_programming;

public class Circle 
{
	public int radius = 0;
	public static double pi = 3.14;
	
	public void giveradius(int r)
	{
		radius=r;
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
	

	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		c1.giveradius(5);
		c1.findArea();
		c1.findCircumference();
		c1.findDiameter();
		c2.giveradius(9);
		c2.findArea();
		c2.findCircumference();
		c2.findDiameter();
		c3.giveradius(6);
		c3.findArea();
		c3.findCircumference();
		c3.findDiameter();
	}
}
