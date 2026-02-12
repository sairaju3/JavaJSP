package constructor;

public class Program2 
{
	public Program2(String s)
	{
		System.out.println(s);
	}
	public Program2(char i , char j)
	{
		System.out.println("Character 1 "+i);
		System.out.println("Character 2 "+j);
		
	}
	public Program2(int k,double d,boolean b)
	{
		System.out.println("Integer value "+k);
		System.out.println("Double value "+d);
		System.out.println("True (or) False :"+b);
	}
	public static void main(String[] args)
	{
		Program2 program1 = new Program2("Hi FRD");
		Program2 program2 = new Program2('A','B');
		Program2 program3= new Program2(20,65.4,true);
	}
}
