package abstract_program2;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Runnner r1=new Runnner();
		r1.run();
		r1.drive();
		r1.show();
		
		System.out.println("---------------------");
		Drive d1=new Drive();
		d1.run();
		d1.drive();
		d1.display();
	}
	
}
