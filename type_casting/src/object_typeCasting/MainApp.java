package object_typeCasting;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Vehical v = new Car();
		v.start();
		v.stop();
		System.out.println("----------------");
		Vehical v1 = new Bike();
		v1.start();
		v1.stop();
		System.out.println("----------------");
		
		//DownCasting
		Car c = (Car)v;
		c.start();
		c.stop();
		c.move();
		System.out.println("---------------");
		Bike b = (Bike)v1;
		b.start();
		b.stop();
		b.shiftGear();	
	}
}
