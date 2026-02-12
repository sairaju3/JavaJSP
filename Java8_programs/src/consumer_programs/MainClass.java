package consumer_programs;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass 
{
	public static void main(String[] args) {
		
		Consumer<String> c = (s)->
		{
			System.out.println(s.length());
			System.out.println(s.charAt(0));
			System.out.println(s.equals("java"));
			System.out.println(s.concat("Developer"));
		};
		c.accept("Java");
	}
}
