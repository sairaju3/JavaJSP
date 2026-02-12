package containerTask;

public class MainApp 
{
	public static void main(String[] args) {
		
		Container<Bus> c = new Container<Bus>();
		
		Bus b1 = new Bus("Pawan Travels", 1834, "APSRTC ", "Sleeper", 35, 250);
		Bus b2 = new Bus("Ganga Travels", 1934, " Moring Travels ", "A/C Seater", 40, 450);
		Bus b3 = new Bus("Intracity Travels", 1735, "Flex Bus ", "A/c Sleeper", 55, 270);
		Bus b4 = new Bus("Sri Sai Travels", 3333, "Orange Travels", " non A/c Seater", 60, 400);
		Bus b5 = new Bus("Pawan Sai Travels", 1918, "Kakathiya Travels ", "Semi Sleeper", 58, 350);
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		//System.out.println(c);
		System.err.println("---------------Bus Details--------------");
		for(int i=0;i<=c.size()-1;i++)
		{
			System.out.println(c.get(i));
			
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		
		int averageSpeed=40;
		
		System.err.println("-----------------------Average Speed Bus Details..-----------------");
		for(int i=0;i<=c.size()-1;i++)
		{
			if(c.get(i)!=null)
			{
				Bus b = c.get(i);
				if(b.getAvgSpeed()>averageSpeed)
					System.out.println(c.get(i));
			}
		}
		
	}
	
}
