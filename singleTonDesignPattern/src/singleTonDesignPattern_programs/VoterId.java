package singleTonDesignPattern_programs;

public class VoterId
{
	private static VoterId v = null;
	private String name;
	private int age;
	private int voterId;
	private VoterId(String name, int age, int voterId) {
		this.name = name;
		this.age = age;
		this.voterId = voterId;
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
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public static VoterId createVoterIdObject()
	{
		if(v==null)
		{
			v=new VoterId("Sai", 22, 22993422);
			System.out.println("Object is Creaded with No :"+v.getVoterId());
		}
		else
		{
			System.out.println("Object is Already Created...");
		}
		return v;
	}
	
}
