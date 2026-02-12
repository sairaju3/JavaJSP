package style3_programming;

public class Rectangle 
{
	public  String color;
	public String outline;
	public String borderStyle ;
	public double length ;
	public double width ;
	
	public Rectangle(String color,String outline,String borderStyle ,double length,double width)
	{
		this.borderStyle=borderStyle;
		this.outline=outline;
		this.color=color;
		this.length=length;
		this.width=width;
	}
	public void display()
	{
		System.out.println("Rectangle is filled with "+color+" color");
		System.out.println("Outline  "+color+" color");
		System.out.println("Border Style is "+borderStyle);
		System.out.println("[length : width ] = ["+length+":"+width+"]");
		System.out.println("****************************");
	}
}
