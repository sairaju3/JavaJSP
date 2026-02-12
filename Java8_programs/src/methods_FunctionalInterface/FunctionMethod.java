package methods_FunctionalInterface;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionMethod 
{
	public static void main(String[] args) 
	{
		Integer[] arr= {3,2,4,1,6}; 
		
		Function<Integer, Integer> f1=a->a*a;
		Function<Integer, Integer> f2=a->a+20;
		
//		Arrays.stream(arr).map(f1.andThen(f2)).forEach(a->System.out.println(a));
		Arrays.stream(arr).map(f1.compose(f2)).forEach(a->System.out.println(a));
		
		
	}
}
