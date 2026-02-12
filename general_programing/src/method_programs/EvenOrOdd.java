package method_programs;

public class EvenOrOdd {
	public static String even(int a,int b)
	{
		if(a%b==0)
		{
			return "Even Number";
		}
		else 
		{
			return "Odd Number";
		}
	}
	public static void main(String[] args)
	{
		System.out.println(even(2,3));
	}
}
