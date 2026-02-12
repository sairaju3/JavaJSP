package style3_programming;

public class Developer 
{
	public String name;
	public int salary;
	public int experience;
	
	public Developer(String name, int salary, int experience) 
	{
		
		this(name,salary); //constructor chaining
//		this.name = name;
//		this.salary = salary;
		this.experience = experience;
	}
	public Developer(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Developer name : "+name);
		System.out.println("Developer salary : "+salary);
		
		if(experience!=0)
		{
		System.out.println("Experience : "+experience);
		}
	}
	public static void main(String[] args)
	{
		Developer developer1 = new Developer("Vamsi",33000,3);
		Developer developer2 = new Developer("Ganesh",20000);
		
		developer1.display();
		System.out.println("---------------------------");
		developer2.display();
	}
}
