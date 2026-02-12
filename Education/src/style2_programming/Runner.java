package style2_programming;

public class Runner 
{
	public static int racedisplace=40;
	public  String name;
	public  int jerseyNo;
	public double avgSpeed;

	
	public void details(String n,int j,double a) 
	{
		name=n;
		jerseyNo=j;
		avgSpeed=a;
		
	}
	public double time() 
	{
		double t= racedisplace/avgSpeed;
		return t;
	}
	public void covTime()
	{
		double timeInSec = time()*3600;
		System.out.println("Time taken to finish the race is "+timeInSec);
	}
	public void display()
	{
		System.out.println(racedisplace+" Marathon race ");
		System.out.println("Name "+name);
		System.out.println("Jersey Number "+jerseyNo);
		System.out.println("Average Running Speed "+avgSpeed+" KMPH");
		covTime();
		
	}
	
	public static void main(String[] args)
	{
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		runner1.details("Nani", 33, 8);
		runner1.display();
		runner2.details("Sai", 03, 9.8);
		runner2.display();
	}
}
