package style3_programming;

public class MainApp //MainClass | 
{
	public static void main(String[] args) 
	{
		Circle circle1 = new Circle("Blue","White","Square Dots",5);
		
		Circle circle2 = new Circle("Green","Red","Circle",9);

		
		circle1.display();
		
		System.out.println("****************************");
		circle2.display();

		
		Rectangle rectangle1 = new Rectangle("Yellow","red","Rectangle Dotted",4,7);
		Rectangle rectangle2 = new Rectangle("Blue","White","Dash",7,9);
		
		rectangle1.display();
		rectangle2.display();
	}
}
