package compileTime_polymorphismPrograms;

public class Customer 
{
	public static void main(String[] args) 
	{
		Myntra m = new Myntra();
		m.purchase(50);
		m.purchase("Mobile");
		m.purchase(500, "Mobile");
	}
}
