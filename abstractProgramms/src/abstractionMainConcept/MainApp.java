package abstractionMainConcept;

public class MainApp 
{
	public static void main(String[] args) 
	{
		BMW bmw = new BMW();
		Engine e=bmw.engine();
		e.engineStars();
		e.engineStop();
	}
}
