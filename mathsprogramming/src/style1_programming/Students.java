package style1_programming;

public class Students {
	public String name = null;
	public static String clgName = "NRIT";
	public static String dept = "ECE";
	public double percentage = 0.0;
	public double interper = 0.0;
	public double degreePre = 0.0;
	public String nativePlace = null;
	
	public static void main(String[] args)
	{
		Students st1 = new Students();
		Students st2 = new Students();
		
		st1.name="Bharat";
		st1.percentage=89.0;
		st1.interper=77.0;
		st1.degreePre=65.0;
		st1.nativePlace="Vijayawada";
		st2.name="Subramanyam";
		st2.percentage=95.0;
		st2.interper=90.0;
		st2.degreePre=68.0;
		st2.nativePlace="Gudivada";
		System.out.println("First Student Name is "+st1.name+" 10th Percentage "+st1.percentage+" Inter Percentage "+st1.interper+" Degree Percentage "+st1.degreePre+" Native Place "+st1.nativePlace+" collage "+clgName+" depatment "+dept);
		System.out.println("Second Student Name is "+st2.name+" 10th Percentage "+st2.percentage+"  Inter Percentage "+st2.interper+" Degree Percentage "+st2.degreePre+" Native Place "+st2.nativePlace+" collage "+clgName+" depatment "+dept);	
	}
}
