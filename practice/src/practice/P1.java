package practice;

public class P1 {
	P1(int x)
	{
		System.out.println("nani");
	}
	P1()
	{
		this(10);
		System.out.println("This");
	}
	public static void main(String[] args) {
		P1 p =new P1();
	}
	
}
