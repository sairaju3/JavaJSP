package abstractionMainConcept;

public class BMW 
{
	public Engine engine() 
	{
		Engine e = new Engine() {

			@Override
			public void engineStars() 
			{	
				System.out.println("Engine Starts...");	
			}

			@Override
			public void engineStop() 
			{
				System.out.println("Engine Stops.");
			}
			
		};
		return e;
	}
}
