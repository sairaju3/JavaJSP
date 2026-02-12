package practice_task;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PrintChar 
{
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("Nani");
		al.add("Sai");
		al.add("Development");
		
		al.stream().forEach((s)->System.out.println(s.charAt(0)));
	}
}
