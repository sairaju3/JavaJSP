package com.streamAPI;

import java.util.ArrayList;

public class Example2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(35);
		al.add(40);
		al.add(55);
		al.add(60);
		
//		al.remove(1);
//		System.out.println(al);
		al.stream().
		filter(a->a%2==0).
		map(e->e/2).
		forEach(s->System.out.println(s));
		
	}
}
