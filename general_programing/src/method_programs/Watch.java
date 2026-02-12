package method_programs;

public class Watch {
	public void time(int hours)
	{
		int seconds = hours*60*60;
		System.out.println(hours+" Hours = "+seconds+" sec");
		 
	}
	public static void main(String[] atgs)
	{
		Watch w1 = new Watch();
		w1.time(4);
		Watch w2 = new Watch();
		w2.time(8);
		
	}
}
