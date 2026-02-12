package treeSet;



public class Student 
{
	private int rollNo;
	private String name;
	private int age;
	private String degree;
	private String stream;
	private int yop;
	public Student(int rollNo, String name, int age, String degree, String stream, int yop) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.stream = stream;
		this.yop = yop;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public int getYop() {
		return yop;
	}


	public void setYop(int yop) {
		this.yop = yop;
	}


	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", degree=" + degree + ", stream="
				+ stream + ", yop=" + yop + "]";
	}
	public int compareTo(Student s) 
	{
		if(this.rollNo>s.rollNo) {
			return 1;
		} 
		else if(this.rollNo<s.rollNo) {
			return -1;
		} 
		else {
			return 0;
		}
		
		//return this.name.compareTo(s.name);//string
	}
}
