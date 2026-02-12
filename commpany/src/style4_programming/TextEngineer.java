package style4_programming;

public class TextEngineer extends EmployeesDetails
{
	public String typeofTesting;

	public TextEngineer(String name,int salary,double YOE,String typeofTesting) 
	{
		super(name,salary,YOE);
		this.typeofTesting = typeofTesting;
	}
	public void textDisplay()
	{
		displayEmpDetails();
		System.out.println(typeofTesting+" Text Engineer ");
	}
	
}
