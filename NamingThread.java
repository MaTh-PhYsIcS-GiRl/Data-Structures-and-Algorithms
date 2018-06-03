
public class NamingThread extends Thread{
	
	public void run()
	{
		System.out.println("Running");
	}
	
	public static void main(String[] args)
	{
		NamingThread one = new NamingThread();
		NamingThread two = new NamingThread();
		
		System.out.println("Name of thread one " + one.getName());
		System.out.println("Name of thread two " + two.getName());
		
		one.start();
		two.start();
		
		one.setName("AWESOMENESS");
		System.out.println("Name of thread after changing it" + one.getName());
	}
}
