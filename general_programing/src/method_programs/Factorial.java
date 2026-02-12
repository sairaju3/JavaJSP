package method_programs;

public class Factorial
{
	public static int calculatFact(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
		  fact = fact * i;
		
		}
		return fact;
	}
	public static void main(String[] args)
	{
	System.out.println(calculatFact(5));
	}
}
