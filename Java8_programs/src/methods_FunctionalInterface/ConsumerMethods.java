package methods_FunctionalInterface;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerMethods 
{
	public static void main(String[] args) {
		
		//
		String[] st= {"java","sql","html","css"};
		
		
		Consumer<String> c1=s->System.out.println(s.toUpperCase());
		Consumer<String> c2=s->System.out.println(s.substring(1));;
		Arrays.stream(st).forEach(c1.andThen(c2));
		
		
	}
}
