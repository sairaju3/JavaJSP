package storageforms;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Container<Student> c=new Container<Student>();
		Student s1 = new Student(2001,"Raju",23);
		Student s2 = new Student(2002,"Rani",23);
		
		c.add(s1);
		c.add(s2);
		int id=2002;
		//System.out.println(c);
		for(int i=0;i<=c.size()-1;i++)
		{
			if(c.get(i)!=null)
			{
				Student s =c.get(i);
				if(s.id==id)
				{
					System.out.println("Id Found.");
				}
			}
		}
		
	}
}
