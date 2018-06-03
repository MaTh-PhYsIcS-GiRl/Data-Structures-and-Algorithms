/**
 * service provider thread that provides services to the user thread
 * life depend on the mercy of user threads i.e.
 * when all the user threads dies, JVM terminates this thread automatically.
 * life depends on USER THREADS
 * LOW PRIORITY THREAD
 * @author Deepansha Singh
 *
 */
public class DaemonExample extends Thread{
	public void run()
	{
		if (Thread.currentThread().isDaemon())//to check whether it is of thread Daemon
			System.out.println("Daemon Thread Works");
		else
			System.out.println("user thread work");
	}
	public static void main(String[] Deepansha)
	{
		//creating the threads
		DaemonExample DEEPANSHA = new DaemonExample();
		DaemonExample DIYANSHA = new DaemonExample();
		DaemonExample FROZEN_SISTERS = new DaemonExample();
		
		DEEPANSHA.setDaemon(true); //1ST Thread is a Daemon thread
		
		//start threads
		DEEPANSHA.start();
		DIYANSHA.start();
		FROZEN_SISTERS.start();

	}
}
