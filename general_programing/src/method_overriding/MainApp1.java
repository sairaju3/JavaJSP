package method_overriding;

public class MainApp1 
{
	public static void main(String[] args)
	{
		BB bb = new BB();
		CC cc = new CC();
		DD dd = new DD();
		bb.swim();
		cc.swim();
		dd.swim();
	}
	
}
