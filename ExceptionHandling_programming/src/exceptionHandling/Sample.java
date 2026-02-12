package exceptionHandling;

public class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		int a=10;
		System.out.println(a+10);
		System.out.println(a-5);
		System.out.println(a*2);
		System.out.println(a/10);
		try 
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not divided by zero");
		}
		System.out.println(a+5);
		System.out.println("Main Ends");
	}
}
