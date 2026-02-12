package style1_programming;

public class Rectangle {
	public static  String color = "green";
	public double length = 0.0;
	public double width = 0.0;
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		r1.length = 8;
		r1.width = 3;
		r2.length = 12;
		r2.width = 8;
		r3.length = 18;
		r3.width = 15;
		System.out.println("Rectangle 1 is [ "+r1.length+" : "+r1.width+" ]");
		System.out.println("Rectangle 2 is [ "+r2.length+" : "+r2.width+" ]");
		System.out.println("Rectangle 3 is [ "+r3.length+" : "+r3.width+" ]");
		
	}

}
