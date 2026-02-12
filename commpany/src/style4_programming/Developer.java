package style4_programming;

public class Developer extends EmployeesDetails
{
	public String language;

	public Developer(String name,int salary,double YOE,String language) 
	{
		super(name,salary,YOE);
		this.language = language;
	}
	public void display()
	{
		displayEmpDetails();
		System.out.println(language+" Language");
	}
}
