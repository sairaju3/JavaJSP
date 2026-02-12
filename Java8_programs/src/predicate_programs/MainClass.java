package predicate_programs;

import java.util.function.Predicate;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p =(num)->num%2==0;
		System.out.println(p.test(20));
		
		Predicate<String> p1=(s)->s.length()%2==0;
		System.out.println(p1.test("SaiRaju"));
		
		
	}
}
