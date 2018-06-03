/**
 * Java Thread pool 
 * represents a group of worker threads that are 
 * waiting for the job and reuse many times.
 * @author Deepansha Singh
 *
 */

/**
 * Better performance It saves time because there is no need to create new thread.
 * USED IN A SERVLET AND JSP
 * @author Deepansha Singh
 *
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class ThreadPoolIntro implements Runnable {
	private String message;
	
	public ThreadPoolIntro(String s)
	{
		this.message = s;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + 
				"(Start) message = " + message);
		processmessage(); 	///call processmessage method that sleeps the thread for 2 seconds  
		System.out.println(Thread.currentThread().getName() + "(End)");
	}
	
	private void processmessage()
	{
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] Deepansha) 
	{
		ExecutorService one = Executors.newFixedThreadPool(5); //creating a pool of 5 threads
		for (int i = 1; i < 10; i++)
		{
			Runnable worker = new ThreadPoolIntro("" + i);
			one.execute(worker); //execute method of Executor Service 
		}
		while (!one.isTerminated())
		{	}
		System.out.println("Finished all threads");
			
	}

}
