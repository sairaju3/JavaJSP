package style1_programming;

public class Car {
	public static String brandName = "BMW";
	public String color = null;
	public String series =null;
	public double avgSpeed = 0.0;
	public double distanceTrv = 0.0;
	public static void main(String[] args)
	{
		Car c1 = new Car();
		Car c2 = new Car();
		c1.color = "BLACK";
		c1.series = "L3.O";
		c1.avgSpeed = 80.0;
		c1.distanceTrv = 1288.70;
		
		c2.color = "BLUE";
		c2.series = "L5.O";
		c2.avgSpeed = 90.0;
		c2.distanceTrv = 1188.70;
		double time1 = c1.distanceTrv/c1.avgSpeed;
		double time2 = c2.distanceTrv/c2.avgSpeed;
		
		
		System.out.println("Car 1 details: BrandName : "+brandName+" color: "+c1.color+" Series: "+c1.series+" Average speed: "+c1.avgSpeed+" Distance Travel: "+c1.distanceTrv+" Time taken:  "+time1);
		System.out.println("Car 1 details: BrandName : "+brandName+" color: "+c2.color+" Series: "+c2.series+" Average speed: "+c2.avgSpeed+" Distance Travel: "+c2.distanceTrv+" Time taken:  "+time2);
		
	}

}
