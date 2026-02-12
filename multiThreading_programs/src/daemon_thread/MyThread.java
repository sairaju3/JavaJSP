package daemon_thread;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
			System.out.println("i m Daemon Thread...");
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
			
		}
	}
}
