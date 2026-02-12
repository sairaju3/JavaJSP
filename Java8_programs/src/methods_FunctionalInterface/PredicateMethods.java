package methods_FunctionalInterface;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateMethods 
{
	public static void main(String[] args) {
		
		Integer [] arr= {33,21,45,46,12,66};
		
		Predicate<Integer> p1=a->a%2==0;
		Predicate<Integer> p2=a->a>10;
		
//		Arrays.stream(arr).filter(p1.and(p2)).forEach(a->System.out.println(a));
//		Arrays.stream(arr).filter(p1.or(p2)).forEach(a->System.out.println(a));
		Arrays.stream(arr).filter(p1.negate()).forEach(a->System.out.println(a));
		
	}
}
