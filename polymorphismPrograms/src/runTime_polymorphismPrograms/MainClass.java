package runTime_polymorphismPrograms;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Employee e = new Developer();
		e.work();
		e=new Tester();
		e.work();
		
		
	}
}
