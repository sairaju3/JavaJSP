package join_method;

public class MyThread2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("My Thread 2");
		}
	}
}
