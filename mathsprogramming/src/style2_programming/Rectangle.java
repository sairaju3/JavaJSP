package style2_programming;

public class Rectangle {
	public static  String color = "green";
	public double length = 0.0;
	public double width = 0.0;
	
	public void giveDimensions(double l,double w)
	{
		length=l;
		width=w;
	}
	public void display()
	{
		System.out.println("Rectangle is "+color+" color");
		System.out.println("[length : width ] "+length+":"+width+"]");
		System.out.println("**************************************");
	}
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		r1.giveDimensions(4, 7);
		r2.giveDimensions(7, 9);
		r3.giveDimensions(5, 7);
		r1.display();
		r2.display();
		r3.display();
	}

}
