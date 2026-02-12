package serializableI;

import java.io.Serializable;

public class Employee implements Serializable
{
	private String name;
	private int id;
	private transient double sal;
	public Employee(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
