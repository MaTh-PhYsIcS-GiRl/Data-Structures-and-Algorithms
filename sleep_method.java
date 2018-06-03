//
public class sleep_method extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++)
		{
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] Deepansha)
	{
		sleep_method one = new sleep_method();
		sleep_method two = new sleep_method();
		
		one.start();
		two.start();
		one.run();
		two.run();
		
		/**
		 *  just invoke run() directly,
		 *  it's executed on the calling thread, 
		 *  just like any other method call. Thread.start() 
		 *  is required to
		 *  actually create a new thread so that the
		 *   runnable's run method is executed in parallel.
		 */
		
	}
}
