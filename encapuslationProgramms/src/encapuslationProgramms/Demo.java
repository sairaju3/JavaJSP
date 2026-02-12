package encapuslationProgramms;
import java.io.Serializable;
public class Demo implements Serializable
{
	private int a;
	private int b;
	
	public Demo()
	{
		
	}
	public Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	//Setter method for A
	public void setA(int a)
	{
		this.a=a;
	}
	//Getter method for B
	public int getA()
	{
		return a;
	}
	//Setter method for B
	public void setB(int b)
	{
		this.b=b;
	}
	//getter method for B
	public int getB()
	{
		return b;
	}
}
