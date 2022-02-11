package practice;

public class ThreadDemo implements Runnable{
	
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" executed "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error occured is "+e);
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo ins1 = new ThreadDemo();
		ThreadDemo ins2 = new ThreadDemo();
		
		Thread t1 = new Thread(ins1);
		Thread t2 = new Thread(ins2);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		
		t1.start();
		t2.start();

	}

}
