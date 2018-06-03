
public class CurrentThread extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] Deepansha)
	{
		CurrentThread one = new CurrentThread();
		CurrentThread two = new CurrentThread();
		
		one.start();
		two.start();
	}
}	
