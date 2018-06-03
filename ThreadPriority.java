
public class ThreadPriority extends Thread{
	
	public void run()
	{
		System.out.println("running thread name is " + Thread.currentThread().getName());
		System.out.println("running thread priority is " + Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args)
	{
		ThreadPriority one = new ThreadPriority();
		ThreadPriority two = new ThreadPriority();
		
		//setting the priorities
		one.setPriority(Thread.MIN_PRIORITY);
		two.setPriority(Thread.MAX_PRIORITY);
		
		one.start();
		two.start();
	}
}
