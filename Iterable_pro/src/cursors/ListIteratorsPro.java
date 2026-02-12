package cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorsPro 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(3);
		al.add(20);
		al.add(33);
		
		ListIterator<Integer> itr =al.listIterator();
		System.out.println("---------------");
		while(itr.hasNext())
		{
			int i = itr.next();
			System.out.println(i);
		}
	}
}
