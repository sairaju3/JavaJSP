package style3_programming;

public class Document
{
	public static char drive = 'E';
	public String name;
	public String type;
	public double size ;
	
	
	public  Document(String name,String type,double size)
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
		Document document1 = new Document("marksMemo", "PDF", 24);
		Document document2 = new Document("Resume", "PDF", 24);
		
		document1.display();
		
		document2.display();
		
		
	}
}
