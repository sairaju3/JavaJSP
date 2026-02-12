package practice_task;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringIntoLowerCase 
{
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("javaM");
		al.add("nani");
		al.add("sai");
		al.add("Raju");
		
	List<String> sl=	al.stream().filter((s)->s.charAt(s.length()-1)=='M').map((k)->k.toLowerCase()).collect(Collectors.toList());
	System.out.println(sl);
	}
}
