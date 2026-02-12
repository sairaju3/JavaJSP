package method_programs;

public class WhatsApp_v3 extends WhatsApp_v2
{
	public void chat()
	{
		super.chat();
		System.out.println("BlueTick....");
	}
	public void call()
	{
		super.call();
		System.out.println("Group Calls...");
	}
	public void status()
	{
		super.status();
		System.out.println("Images And Videos...");
	}
	public void location()
	{
		System.out.println("Current Location....");
	}
}
