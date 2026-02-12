package style1_programming;

public class Teacher {
	public String name = null;
	public String subject = null;
	public int joiningYear = 0;
	public int salary = 0;
	public static String schoolName = "Sri Bharathi E.M School";
	
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		Teacher t3 = new Teacher();
		t1.name="Vamsi";
		t1.subject="English";
		t1.joiningYear=2012;
		t1.salary=35000;
		
		t2.name="Radha";
		t2.subject="Maths";
		t2.joiningYear=2015;
		t2.salary=30000;
		
		t3.name="Suresh";
		t3.subject="Hindi";
		t3.joiningYear=2018;
		t3.salary=30000;
		
		int Experience1=13*12;
		int annSalary1=t1.salary*12;
		int Experience2=10*12;
		int annSalary2=t2.salary*12;
		int Experience3=7*12;
		int annSalary3=t3.salary*12;
		
		System.out.println("-----------Teacher 1---------");
		System.out.println(" Teache name "+t1.name+"\n Subject "+t1.subject+"\n Joining Year "+t1.joiningYear+"\n Salary  "+t1.salary+"\n School Name "+schoolName+"\n Year of Experience "+Experience1+"Months \n annual salary "+annSalary1);
		System.out.println("-----------Teacher 2---------");
		System.out.println(" Teache name "+t2.name+"\n Subject "+t2.subject+"\n Joining Year "+t2.joiningYear+"\n Salary  "+t2.salary+"\n School Name "+schoolName+"\n Year of Experience "+Experience2+" Months\n annual salary "+annSalary2);
		System.out.println("-----------Teacher 3---------");
		System.out.println(" Teache name "+t3.name+"\n Subject "+t3.subject+"\n Joining Year "+t3.joiningYear+"\n Salary  "+t3.salary+"\n School Name "+schoolName+"\n Year of Experience "+Experience3+"Months \n annual salary "+annSalary3);

	}
}
