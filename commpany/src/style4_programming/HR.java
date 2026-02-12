package style4_programming;

public class HR extends EmployeesDetails
{
	public String typeOfHR;

	public HR(String name, int salary, double YOE, String requiepment) 
	{
		super(name, salary, YOE);
		this.typeOfHR = requiepment;
	}
	public void hrDisplay()
	{
		displayEmpDetails();
		System.out.println("HR is  "+typeOfHR+" Requiepment");
	}
}
