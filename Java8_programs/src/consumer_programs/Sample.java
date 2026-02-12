package consumer_programs;

import java.util.function.Consumer;

public class Sample implements Consumer<String>
{

	@Override
	public void accept(String s) {
		
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.equals("java"));
		System.out.println(s.concat("Developer"));
		
	}
	public static void main(String[] args) {
		
		Sample s= new Sample();
		s.accept("Java");
	}
	
}
