package predicate_programs;

import java.util.function.Predicate;

public class Demo implements Predicate<Integer>
{

	@Override
	public boolean test(Integer i) {
		
		if(i%2==0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		System.out.println(d.test(20));
	}

}
