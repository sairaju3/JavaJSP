package method_programs;

public class Car
{
	public int getdistance(int speed , int time)
	{
		int distance = speed*time;
		return distance;
		
	}
	public void gettime(int time)
	{
		int min = time*60;
		System.out.println("Time : ["+time+"Hours = "+min+" Min]");
	}
	public void getKmtoMeters(int km)
	{
		int kmtoMeter = km*1000;
		System.out.println("Kilometers ["+km+" km = " +kmtoMeter+" Meters]");
	}
	public static void main(String[] atgs)
	{
		Car c1 = new Car();
		c1.gettime(6);
		c1.getKmtoMeters(c1.getdistance(60, 6));
	}
}
