package toStringMethod_Programs;

public class Student 
{
	private String name;
	private int markes;
	private int age;
	private char section;
	
	public Student(String name, int markes, int age, char section) 
	{

		this.name = name;
		this.markes = markes;
		this.age = age;
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarkes() {
		return markes;
	}

	public void setMarkes(int markes) {
		this.markes = markes;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}
	public void display()
	{
		System.out.println("Student Name :"+getName());
		System.out.println("Student Markes : "+getMarkes());
		System.out.println("Student Age : "+getAge());
		System.out.println("Student Section : "+getSection());
	}
	public String toString()
	{
		return "Name : "+getName()+"\nMarks: "+getMarkes()+"\nAge : "+getAge();
	}
	
}
