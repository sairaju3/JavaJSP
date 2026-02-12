package functional_interface_programs;

public class MainClass 
{
	public static void main(String[] args) {
		
		Demo d =()->System.out.println("Running....");
		d.run();
	}
}
