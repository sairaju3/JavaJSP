package style4_programming;

public class Shapes 
{
	public String color;
	public String outlineColor;
	public String borderStyle ;
	
	public Shapes(String color,String outline,String borderStyle)
	{
		this.color=color;
		this.outlineColor=outlineColor;
		this.borderStyle=borderStyle;
	}
	public void displayShapeDetails()
	{
		System.out.println("Rectangle is filled with "+color+" color");
		System.out.println("Outline  "+color+" color");
		System.out.println("Border Style is "+borderStyle);
		
	}
}
