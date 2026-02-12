package constructor;

public class Program1 
{
	public Program1()
	{
		System.out.println("Constructor without parameter");
	}
	public Program1(double s)
	{
		System.out.println("I "+s);
		
	}
	public static void main(String[] args)
	{
		Program1 program1 = new Program1();
		Program1 program2 = new Program1();
		Program1 program3 = new Program1(23.5);
		Program1 program4 = new Program1(20.89);
	}
}
