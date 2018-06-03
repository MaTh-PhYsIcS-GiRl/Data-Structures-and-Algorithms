/**
 *The join() method waits for a thread to die. In other words, it causes
 *the currently running threads to stop executing until the 
 *thread it joins with completes its task.
 * @author Deepansha Singh
 *
 */
public class Join1 extends Thread{
	
	public void run()
	{
		for (int i = 1; i < 5; i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] Deepansha)
	{
		Join1 DEEPANSHA = new Join1();
		Join1 DIYANSHA = new Join1();
		Join1 sisters = new Join1();
		
		DEEPANSHA.start();
		try {
			DEEPANSHA.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		DIYANSHA.start();
		sisters.start();
	}
}
