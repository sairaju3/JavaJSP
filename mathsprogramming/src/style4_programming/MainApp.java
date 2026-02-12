package style4_programming;

public class MainApp //MainClass | MainApp |
{
	public static void main(String[] args) 
	{
		Circle circle1 = new Circle("Blue","White","Square Dots",5);
		Circle circle2 = new Circle("Green","Red","Solid",9);
		
		circle1.display();
		System.out.println("****************************");
		circle2.display();
		System.out.println("****************************");
		
		Rectangle rectangle1 = new Rectangle("Yellow","red","Rectangle Dotted",4,7);
		Rectangle rectangle2 = new Rectangle("Blue","White","Dash",7,9);
		
		rectangle1.display();
		System.out.println("****************************");
		rectangle2.display();
	}
}
