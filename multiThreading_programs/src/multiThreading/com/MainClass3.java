package multiThreading.com;


public class MainClass3
{
	public static void main(String[] args)
	{	
		Runnable r1=()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Hi Nanna");
			}
		};
		
		Thread t1 = new Thread(r1);
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Hi Nani ");
			}
		});
		
		t1.start();
		t2.start();
	}
}
