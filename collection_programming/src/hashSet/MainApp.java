package hashSet;

import java.util.HashSet;

public class MainApp 
{
	public static void main(String[] args) 
	{
		MovieTicket t1=new MovieTicket(1321, "RRR", "Balaji", "Telugu", 200, "A2");
		MovieTicket t2 = new MovieTicket(1002, "KGF", "Ambica", "Malayalam", 250, "D7");
		MovieTicket t3 = new MovieTicket(1166, "Kantara", "PVR", "Hindi", 300, "L1");
		MovieTicket t4 = new MovieTicket(2290, "Devara", "90MM", "Telugu", 500, "C9");
		MovieTicket t5 = new MovieTicket(7650, "K-Ramp", "Arjun", "English", 315, "B2");
		MovieTicket t6 = new MovieTicket(7124, "Siva", "90MM", "Telugu", 200, "A8");
		MovieTicket t7 = new MovieTicket(1100, "Little Hearts", "Nexus", "Telugu", 315, "D2");
		
		HashSet<MovieTicket> hs= new HashSet<MovieTicket>();
		hs.add(t1); 
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
		hs.add(t7);
		
		for(MovieTicket t :hs)
		{
			System.out.println(t);
		}
	}
}
