package constructor;

public class Sample 
{
	public Sample(String s,boolean b)
	{
		
		System.out.println("name :"+s);
		System.out.println("true or false : "+b);
	}
	public static void main(String[] args)
	{
		Sample sample1 = new Sample("nani",true);
		Sample sample2 = new Sample("fkhbhg",false);
	}
}
