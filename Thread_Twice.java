/**
 * AFTER STARTING A THREAD, IT CAN NEVER BE STARTED AGAIN!!!!!!!!
 * @author Deepansha Singh
 *
 */
public class Thread_Twice extends Thread{
	
	public void run()
	{
		System.out.println("running");
	}
	
	public static void main(String[] Deepansha)
	{
		Thread_Twice one = new Thread_Twice();
		one.start();
		one.start(); //IllegalThreadStateException
	}
}
