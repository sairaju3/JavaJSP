package method_programs;

public class LargestOfThreeNum 
{
	public static void largest(int a,int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a+" is the largest number ");
		}
		else if(b>c)
		{
			System.out.println(b+" is the largest number ");
		}
		else
		{
			System.out.println(c+" is the largest number ");
		}
	}
	public static void main(String[] args)
	{
		largest(5,3,1);
		largest(5,8,1);
		largest(5,8,10);
	}
}
