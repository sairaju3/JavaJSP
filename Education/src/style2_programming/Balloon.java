package style2_programming;

public class Balloon
{
	public static String gas = "Helium";
	public String color = null;
	public String shape = null;
	public int price ;
	
	public void show(String c,String s,int p) 
	{
		color=c;
		shape=s;
		price=p;
	}
	public void display()
	{
		System.out.println("Ballon color: "+color+" \nShape: "+shape+" \nGasType: "+gas+" \nPrice: "+price+"Rs");
	}
	public static void main(String[] args)
	{
		Balloon b1=new Balloon();
		Balloon b2=new Balloon();
		b1.show("orange", "circle", 50);
		b2.show("green", "Heart", 143);
		b1.display();
		System.out.println("***********************************");
		b2.display();
	}
			
}
