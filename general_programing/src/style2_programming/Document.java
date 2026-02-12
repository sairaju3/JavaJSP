package style2_programming;

public class Document
{
	public static char drive = 'E';
	public String name;
	public String type;
	public double size ;
	
	
	public void details(String name,String type,double size)
	{
		this.name=name;
		this.type=type;
		this.size=size;
	
	}
	public void conMbIntoKb()
	{
		double covMbtoKb = size*1024;
		System.out.println(" | "+covMbtoKb);
	}
	public void display()
	{
		System.out.println(drive+" :Drive");
		System.out.print("Name : "+name+"."+type+" "+size+" MB");
		conMbIntoKb();
		System.out.println(" ");
		
	}
	public static void main(String[] args)
	{
		Document document1 = new Document();
		Document document2 = new Document();
		document1.details("marksMemo", "PDF", 24);
		document1.display();
		document2.details("Resume", "PDF", 24);
		document2.display();
		
		
	}
}
