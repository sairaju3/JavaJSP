package singleTonDesignPattern_programs;

public class AadharCard 
{
	private static AadharCard a = null;
	private long aadharNo;
	private String name;
	private int age;
	private String gender;
	private int dob;
	private String address;
	
	private AadharCard(long aadharNo, String name, int age, String gender, int dob, String address) 
	{
		this.aadharNo = aadharNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public static AadharCard createAadharObject()
	{
		if(a==null)
		{
			a=new AadharCard(663065513940l, "Sai", 22, "Male", 03072003, "Eluru");
			System.out.println("Aadhar Object is creaded with no:"+a.getAadharNo());
		}
		else
		{
			System.out.println("Aadhar object is already Created...");
		}
		return a;
	}
}
