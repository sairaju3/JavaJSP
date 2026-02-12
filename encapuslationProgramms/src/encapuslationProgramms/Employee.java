package encapuslationProgramms;
import java.io.Serializable;
public class Employee implements Serializable
{
	private String name;
	private int id;
	private int salary;
	private String location;
	private String designation;
	
	public Employee()
	{
		
	}

	public Employee(String name, int id, int salary, String location, String designation) 
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.location = location;
		this.designation = designation;
	}
	//Setter method for Name
	public void setName(String name)
	{
		if(name.equals("Nani") || name.equals("Sai Raju") || name.equals("Vamsi"))
		{
			this.name=name;
		}
		else
		{
			System.out.println("Wrong Name");
		}
	}
	//Getter method for Name
	public String getName()
	{
		return name;
	}
	//Setter method for Id
	public void setId(int id)
	{
		if(id%2==0)
		{
			this.id=id;
		}
		else
		{
			System.out.println("Wrong Id ");
		}
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(int salary)
	{
		if(salary>=5000 && salary<=90000)
		{
			this.salary=salary;
		}
		else
		{
			System.out.println("Wrong Salary");
		}
	}
	public int getSalary()
	{
		return salary;
	}
	public void setLocation(String location)
	{
		if(location.equals("Benglore") || location.equals("Hyb") || location.equals("Pune"))
		{
			this.location=location;
		}
		else
		{
			System.out.println("Wrong location... ");
			
		}
	}
	public String getLocation()
	{
		return location;
	}
	public void setDesignation(String designation)
	{
		if(designation.equals("developer") || designation.equals("DBS")|| designation.equals("Test"))
		{
			this.designation=designation;
		}
		else
		{
			System.out.println("Wrong Designation..." );
		}
	}
	public String getDesignation()
	{
		return designation;
	}
	public void display()
	{
		System.out.println("Name of the Employee "+getName());
		System.out.println("Id of the Emplyee "+getId());
		System.out.println(" "+getSalary());
		System.out.println(" "+getLocation());
		System.out.println(" "+getDesignation());
		
}
