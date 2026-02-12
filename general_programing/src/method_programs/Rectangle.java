package method_programs;

public class Rectangle 
{
	public  void getarea(int length , int width)
	{
		int area = length*width;
		System.out.println("Area :"+area);
	}
	public void convertlength(int length)
	{
		int lengthConvert = length*10;
		System.out.println("Convert Length ["+length+ "CM is "+lengthConvert+"MM]");
	}
	public void convertwidth(int width)
	{
		int widthConvert = width*10;
		System.out.println("Convert Width ["+width+"CM is "+widthConvert+"MM]");
	}
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		r1.getarea(5, 4);
		r1.convertlength(5);
		r1.convertwidth(4);
		
	}
}
