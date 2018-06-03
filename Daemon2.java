/**
 *Note: If you want to make a user thread as Daemon,
 *it must not be started otherwise it will throw IllegalThreadStateException.
 * @author Deepansha Singh
 *
 */
public class Daemon2 extends Thread{
	
	public void run()
	{
		System.out.println("Name of thread  : " +Thread.currentThread().getName());
		System.out.println("Dameon : " +Thread.currentThread().isDaemon());
		}
	
	public static void main(String[] Deepansha)
	{
		//creating the threads
		Daemon2 march = new Daemon2();
		Daemon2 october = new Daemon2();
		 
		//starting the threads
		march.start();
		march.setDaemon(true);	//WILL THROW EXCEPTION HERE : Illegal Thread State Exception
		october.start();
	}
}
