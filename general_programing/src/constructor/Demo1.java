package constructor;

public class Demo1 
{
	public Demo1(int a)
	{
		System.out.println("constructor demo "+a);
	}
	public static void main(String[] args)
	{
		Demo1 demo1 = new Demo1(2);
		Demo1 demo2 = new Demo1(3);
		Demo1 demo3 = new Demo1(5);
		
	}
}
