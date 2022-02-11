package practice;

public class MainThread implements Runnable{
	
	public static int count = 0;
	
	public void run()
	{
		while(MainThread.count<=10)
		{
			try
			{
				System.out.println("My Thread "+ (++MainThread.count));
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Some error occured "+e);
			}
		}
	}

	public static void main(String[] args) {
		MainThread ins = new MainThread();
		Thread mytrd = new Thread(ins);
		mytrd.start();
		
		while(MainThread.count<=10)
		{
			try
			{
				System.out.println("Main Thread "+ (++MainThread.count));
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Some error occured "+e);
			}
		}
		System.out.println("Main Thread Completed");

	}

}
