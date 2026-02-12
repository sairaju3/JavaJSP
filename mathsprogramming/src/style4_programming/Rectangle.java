package style4_programming;

public class Rectangle extends Shapes
{
	
	public double length ;
	public double width ;
	
	public Rectangle(String color,String outlineColor,String borderStyle ,double length,double width)
	{
		super(color,outlineColor,borderStyle);
		this.length=length;
		this.width=width;
	}
	public void display()
	{
		displayShapeDetails();
		System.out.println("[length : width ] = ["+length+":"+width+"]");
		
	}
}
