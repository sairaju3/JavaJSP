package level3_accessing;

class A
{
	public void show()
	{
		System.out.println("Show....");	
	}
}
class B extends A
{
	public void view()
	{
		System.out.println("View....");
	}
	public void display()

	{
		view();
		show();
	}
}


public class MainApp 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.display();
	}
}
