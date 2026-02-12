package constructor;

public class Simple2 
{
	public Simple2(int i,int j)
	{
		System.out.println("i = "+i+"\nj = "+j);
	}
	public Simple2(int i , int j , double k)
	{
		this(i,j);
		System.out.println("k = "+k);
	}
	
	public static void main(String[] args)
	{
		Simple2 simple1 = new Simple2(20,30);
		System.out.println("*************");
		Simple2 simple2 = new Simple2(10,33,99.9);
	}
}
