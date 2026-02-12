package constructor;

public class Demo 
{
	public Demo()
	{
		System.out.println("Constructor Executed");	
	}
	public static void main(String[] args)
	{
		System.out.println("Main Started");
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		System.out.println("Main End");
	}
}
