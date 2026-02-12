package style4_programming;

public class MainApp 
{
	public static void main(String[] args)
	{
		Developer developer1 = new Developer("SAI",23000,3.2,"Java");
		developer1.display();
		System.out.println("*********************************");
		Developer developer2 = new Developer("Nani",33000,3.9,"Python");
		developer2.display();
		System.out.println("*********************************");
		TextEngineer textEngineer1 = new TextEngineer("Ganesh",20000,2.0,"Manual");
		textEngineer1.textDisplay();
		System.out.println("*********************************");
		TextEngineer textEngineer2 = new TextEngineer("Vamsi",20000,3.0,"AutoMation");
		textEngineer2.textDisplay();
		System.out.println("*********************************");
		HR hr1 = new HR("Teju",30000,4.5,"Requipnemt");
		hr1.hrDisplay();
		System.out.println("*********************************");
		HR hr2 = new HR("Varshine",30000,4.5,"Employee Relational HR");
		hr2.hrDisplay();
	}
}
