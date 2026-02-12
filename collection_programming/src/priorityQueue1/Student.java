package priorityQueue1;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private String degree;
	private String stream;
	private int yop;
	public Student(int id, String name, int age, String degree, String stream, int yop) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.stream = stream;
		this.yop = yop;
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDegree() {
		return degree;
	}

	public String getStream() {
		return stream;
	}

	public int getYop() {
		return yop;
	}



	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", degree=" + degree + ", stream=" + stream
				+ ", yop=" + yop + "]";
	}	
}
