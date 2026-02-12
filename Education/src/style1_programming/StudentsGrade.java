package style1_programming;

public class StudentsGrade
{
	public static String grade(char g)
	{
		switch(g)
		{
			case 'A':return "1st Rank";
			case 'B':return "2nd Rank";
			case 'C':return "3rd Rank";
			case 'D':return "1st Class";
			case 'E':return "2nd Class";
			case 'F':return "Fail";
			default :return "Invalid Character";
			
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Your Result is "+grade('C'));
		System.out.println("Your Result is "+grade('y'));
	}
}
