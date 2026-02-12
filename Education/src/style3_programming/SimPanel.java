package style3_programming;

public class SimPanel 
{
	public String sim1;
	public String sim2;
	public String sdCard;
	
	public SimPanel(String sim1,String sim2,String sdCard)
	{
		this(sim1,sim2);
//		this.sim1=sim1;
//		this.sim2=sim2;
		this.sdCard=sdCard;
		
	}

	public SimPanel(String sim1, String sim2) 
	{
		
		
//		this.sim1 = sim1;
		this.sim2 = sim2;
	}

	public SimPanel(String sim1) 
	{
		
		this.sim1 = sim1;
	}
	public void display()
	{
		System.out.println("Sim1 : "+sim1);
		if(sim2!=null)
		{
			System.out.println("Sim2 : "+sim2);
		}
		if(sdCard!=null)
		{
			System.out.println("sdCard : "+sdCard);
		}
		
	}
	public static void main(String[] args)
	{
		SimPanel simPanel1 = new SimPanel("Airtel","Jio");
		
		SimPanel simPanel2 = new SimPanel("BSNL");
		
		SimPanel simPanel3 = new SimPanel("Jio","Jio","disk");
		
		simPanel1.display();
		System.out.println("----------------------------------");
		simPanel2.display();
		System.out.println("----------------------------------");
		simPanel3.display();
	}
}
