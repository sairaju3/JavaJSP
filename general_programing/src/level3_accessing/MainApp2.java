package level3_accessing;

class C
{
	public void h1()
	{
		System.out.println("h1........");
	}
}
class D extends C
{
	public void h2()
	{
		System.out.println("h2........");
	}
}
class E extends D
{
	public void h3()
	{
		System.out.println("h3...........");
	}
	public void live()
	{
		h3();
		h2();
		h1();
	}
}


public class MainApp2 
{
	public static void main(String[] args)
	{
		E e1 = new E();
		e1.live();
	}
}
