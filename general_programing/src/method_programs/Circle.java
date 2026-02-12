package method_programs;

public class Circle
{
	public void area(int r)
	{
		double pi = 3.14;
		double area = pi*r*r;
		{
			System.out.println("Area : "+area);
		}
		
	}
	public void circumference(int r)
	{
		double pi = 3.14;
		double cirfere = 2*pi*r;
		{
			System.out.println("Circumference : "+cirfere);
		}
	}
	public void diameter(int r)
	{
		int diameter = 2*r;
		{
			System.out.println("Diameter : "+diameter);
		}
		
	}
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.area(4);
		c1.circumference(4);
		c1.diameter(4);
		System.out.println("-----------Second Circle--------------");
		Circle c2 = new Circle();
		c2.area(7);
		c2.circumference(7);
		c2.diameter(7);
		Circle c3 = new Circle();
		c3.area(9);
		c3.circumference(9);
		c3.diameter(9);
		
	}
}
