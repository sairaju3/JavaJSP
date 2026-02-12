package predicate_programs;

import java.util.function.Predicate;

public class Sample implements Predicate<String>
{

	@Override
	public boolean test(String s) {
		
		if(s.length()%2==0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		
		Sample s = new Sample();
		System.out.println(s.test("nani"));
	}

}
