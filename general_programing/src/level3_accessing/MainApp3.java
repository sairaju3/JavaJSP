package level3_accessing;

class F
{
	public void rise()
	{
		System.out.println("Rise...");
	}
}
class G extends F
{
	public void fall()
	{
		System.out.println("fall..");
	}
	public void recover()
	{
		fall();
		rise();
	}
}
class H extends F
{
	public void fly()
	{
		
		System.out.println("fly");
	}
	public void review()
	{
		fly();
		rise();
	}
}


public class MainApp3 
{
	public static void main(String[] args)
	{
		G g1 = new G();
		g1.recover();
		H h1 = new H();
		h1.review();
	}
}
