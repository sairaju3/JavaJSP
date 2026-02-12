package style2_programming;

public class Students {
	public String name = null;
	public static String clgName = "NRIT";
	public static String dept = "ECE";
	public double percentage = 0.0;
	public double interper = 0.0;
	public double degreePre = 0.0;
	public String nativePlace = null;
	
	public void details(double tenth,double inter,double degree,String name1,String loc)
	{
		percentage=tenth;
		interper=inter;
		degreePre=degree;
		name=name1;
		nativePlace=loc;
	}
	public void display()
	{
		System.out.println("First Student Name is "+name+" 10th Percentage "+percentage+" Inter Percentage "+interper+" Degree Percentage "+degreePre+" Native Place "+nativePlace+" collage "+clgName+" depatment "+dept);
	}
	public void avgper()
	{
		double avg = (percentage+interper+degreePre)/3;
		System.out.println("Average percentage is "+avg);
	}
	
	public static void main(String[] args)
	{
		Students st1 = new Students();
		Students st2 = new Students();
		st1.details(89.0, 77.0, 65.0, "Bharat", "Vijayawada");
		st1.avgper();
		st1.display();
		System.out.println("***************************************");
		st2.details(95.0, 90.0, 68.0, "Vamsi", "Gudivada");
		st2.avgper();
		st2.display();
		
		//System.out.println("First Student Name is "+st1.name+" 10th Percentage "+st1.percentage+" Inter Percentage "+st1.interper+" Degree Percentage "+st1.degreePre+" Native Place "+st1.nativePlace+" collage "+clgName+" depatment "+dept);
	//	System.out.println("Second Student Name is "+st2.name+" 10th Percentage "+st2.percentage+"  Inter Percentage "+st2.interper+" Degree Percentage "+st2.degreePre+" Native Place "+st2.nativePlace+" collage "+clgName+" depatment "+dept);
		
	}
}
