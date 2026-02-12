package predicate_programs;
import java.util.function.Predicate;
public class PrimeOrNot
{
	public static void main(String[] args) {
		
		int[] arr= {2,4,5,7,13,22,45,3};
		
		Predicate<Integer> p1 = a->{
			
			int count=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
					count++;
			}
			return count==2;
			
		};
		for(int i=0;i<=arr.length-1;i++)
		{
			int ele=arr[i];
			if(p1.test(ele))
				System.out.print(ele+" ");
		}
		System.out.println();
	}
}
