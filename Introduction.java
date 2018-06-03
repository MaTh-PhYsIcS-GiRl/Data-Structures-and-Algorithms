/**
 * perform multiple operations at the same time
 * SAVES TIME
 * independent threads : exception only occurs in single thread
 * THREAD = SEPARATE PATH OF EXECUTION
 * ONE PROCESS CAN HAVE MULTIPLE THREADS
 * NEW, RUNNABLE, RUNNING, NON RUNNABLE, TERMINATED
 * 
 */
//extend thread class
public class Introduction extends Thread{
	public void run()
	{
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args)
	{
		Introduction one = new Introduction();
		one.start();
	}
}
