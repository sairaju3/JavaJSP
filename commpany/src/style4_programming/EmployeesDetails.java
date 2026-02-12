package style4_programming;

public class EmployeesDetails 
{
	public String name;
	public int salary;
	public double YOE;

	public EmployeesDetails(String name, int salary, double YOE) 
	{
		
		this.name = name;
		this.salary = salary;
		this.YOE = YOE;
	}
	public void annualSalary()
	{
		double annualsalary = salary*12;
	}
	public void displayEmpDetails()
	{
		annualSalary();
		System.out.println("Employee name : "+name);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Year of Experience  : "+YOE);
		
		
	}
	
}
