package method_programs;

public class WhatsApp_v2 extends WhatsApp
{
	public void chat()
	{
		super.chat();
		System.out.println("Double Tick..");
	}
	public void call()
	{
		super.call();
		System.out.println("Video Call");
	}
	public void status()
	{
		System.out.println("Images...");
	}
}
