/**
 * returns reference to a current executing thread object	
 * @author Deepansha Singh
 *
 */
public class RunStart extends Thread{
	
	public void run()
	{
		System.out.println("Running");
	}
	
	public static void main(String[] Deepansha)
	{
		RunStart one = new RunStart();
		one.run();	//fine, but does not start a separate call stack 
		one.start();
	}
}
