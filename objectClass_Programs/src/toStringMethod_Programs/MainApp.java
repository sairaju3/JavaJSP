package toStringMethod_Programs;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Student student1 = new Student("Nani",80,21,'A');
		
		
		Student student2 = new Student("Sai",75,22,'B');
		
		Student student3 = new Student("Raju",70,21,'A');
	
		
		
		Student student4 = new Student("Kumar",85,23,'C');
		String s2 = student1.toString();
		System.out.println(s2);
		String s4=student4.toString();	
		System.out.println(s4);
		System.out.println("--------------------------");
		student2.display();
		student3.display();
	}
}
