package constructor;

public class Chaining1 
{
	public Chaining1(int a,double b , int c)
	{
		System.out.println(" a = "+a);
		System.out.println(" b = "+b);
		System.out.println(" c = "+c);
	}
	public Chaining1(int a , double b,int c,char d)
	{
		this(a,b,c);
		System.out.println(" d = "+d);
	}
	public Chaining1(int a,double b, int c,boolean e)
	{
		this(a,b,c);
		System.out.println(" e = "+e);
	}
	public static void main(String[] args)
	{
		Chaining1 chaining1 = new Chaining1(10,20.6,20);
		System.out.println("*********************");
		Chaining1 chaining2 = new Chaining1(33,0.9,99,'E');
		System.out.println("*********************");
		Chaining1 chaining3 = new Chaining1(11,22.3,88,true);
		
	}
}
