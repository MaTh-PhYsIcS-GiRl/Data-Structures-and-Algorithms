/**
 * perform cleanup resource or save the state when JVM shuts down normally or abruptly
 * JVM shuts down when :
 * user presses ctrl+c on the command prompt
 * System.exit(int) method is invoked
 * user logoff
 * user shutdown etc.
 * @author Deepansha Singh
 *
 */
public class JavaShutdownHook extends Thread{
	
	public void run()
	{
		System.out.println("shut down hook task completed");
	}
	
	public static void main(String[] Deepansha)
	{
		Runtime r = Runtime.getRuntime();//object of a runtime class : call getRuntime()
		
		r.addShutdownHook(new JavaShutdownHook());// register the thread with the Virtual Machine
		
		System.out.print("Now main sleeping...press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			
		}
		
	}
}
