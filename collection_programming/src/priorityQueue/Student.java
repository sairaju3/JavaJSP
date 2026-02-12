 package priorityQueue;

public class Student implements Comparable<Student>
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
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", degree=" + degree + ", stream=" + stream
				+ ", yop=" + yop + "]";
	}
	@Override
	public int compareTo(Student s) 
	{
//		if(this.age>s.age) {
//			return 1;
//		} 
//		else if(this.age<s.age) {
//			return -1;
//		} 
//		else {
//			return 0;
//		}
		
		return this.name.compareTo(s.name);//string
	}
	
	
	
}
