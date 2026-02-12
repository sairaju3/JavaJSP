package style1_programming;

public class Circle {
	public int radius=0;
	public static double pi = 3.14;
	
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		Circle c2=new Circle();
		Circle c3=new Circle();
		c1.radius=8;
		c2.radius=4;
		c3.radius=13;
		System.out.println("Circle 1 radius is "+c1.radius);
		System.out.println("Circle 2 radius is "+c2.radius);
		System.out.println("Circle 3 radius is "+c3.radius);
		
	}
}
