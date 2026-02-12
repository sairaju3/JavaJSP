package method_programs;

public class Simple 
{
	public void fly(String s)
	{
		System.out.println("Fly like Eagle.....");
	}
}
class Flight extends Simple
{
		public void fly(String s)
		{
			System.out.println("Fly like Butterfly...");
		}
		public void fly(int a)
		{
			System.out.println("Fly like ...");
		}
		
}

