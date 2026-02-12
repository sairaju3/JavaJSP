package style3_programming;

public class Student 
{
	public String name ;
	public double tenth;
	public double inter;
	public double degree;
	public double masters;
	
	public Student(String name, double tenth, double inter, double degree, double masters) 
	{
		this(name,tenth,inter,degree);
		
//		this.name = name;
//		this.tenth = tenth;
//		this.inter = inter;
//		this.degree = degree;
		this.masters = masters;
	}

	public Student(String name, double tenth, double inter, double degree) {
		
		
		
		this.name = name;
		this.tenth = tenth;
		this.inter = inter;
		this.degree = degree;
	}
	public void display() 
	{
		System.out.println("Student Name : "+name );
		System.out.println("Tenth % : "+tenth);
		System.out.println("Inter % : "+inter);
		System.out.println("Degree % : "+degree);
		if(masters!=0.0)
		{
			System.out.println("Masters % : "+masters);
		}
			
	}
	public static void main(String[] args)
	{
		Student student1 = new Student("Vamsi",78.4,89.3,69.9);
		Student student2 = new Student("Ganesh",89.6,85.4,70.0,82.3);
		
		student1.display();
		System.out.println("---------------------");
		student2.display();
	}
	
}
