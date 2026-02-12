package com.employee_management_system;
//Bean Class
public class Employee 
{
	private String employeeId;
	private String employeeName;
	private int employeeAge;
	private String employeeEmailId;
	private String employeeType;
	private String employeeDesigantion;
	private double employeeSalary;
	private double employeeyYOE;
	public Employee(String employeeName, int employeeAge, String employeeEmailId, String employeeType,
			String employeeDesigantion, double employeeSalary, double employeeyYOE) 
	{
		
	
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeEmailId = employeeEmailId;
		this.employeeType = employeeType;
		this.employeeDesigantion = employeeDesigantion;
		this.employeeSalary = employeeSalary;
		this.employeeyYOE = employeeyYOE;
		this.employeeId=Employee_Validation.generateId(employeeName);
	}
	
	public void setEmployeeId(String employeeId) 
	{
		this.employeeId = employeeId;
	}
	public String getEmployeeName() 
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() 
	{
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) 
	{
		this.employeeAge = employeeAge;
	}
	public String getEmployeeEmailId() 
	{
		return employeeEmailId;
	}
	public void setEmployeeEmailId(String employeeEmailId) 
	{
		this.employeeEmailId = employeeEmailId;
	}
	public String getEmployeeType()
	{
		return employeeType;
	}
	public void setEmployeeType(String employeeType) 
	{
		this.employeeType = employeeType;
	}
	public String getEmployeeDesigantion() 
	{
		return employeeDesigantion;
	}
	public void setEmployeeDesigantion(String employeeDesigantion) 
	{
		this.employeeDesigantion = employeeDesigantion;
	}
	public double getEmployeeSalary() 
	{
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) 
	{
		this.employeeSalary = employeeSalary;
	}
	public double getEmployeeyYOE() 
	{
		return employeeyYOE;
	}
	public void setEmployeeyYOE(int employeeyYOE) 
	{
		this.employeeyYOE = employeeyYOE;
	}
//	public {
//		
//	}

	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", employeeEmailId=" + employeeEmailId + ", employeeType=" + employeeType + ", employeeDesigantion="
				+ employeeDesigantion + ", employeeSalary=" + employeeSalary + ", employeeyYOE=" + employeeyYOE +" Year"+ "]";
	}
	
}
