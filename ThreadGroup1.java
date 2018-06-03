/**
 * group multiple threads in a single object
 * suspend, resume or interrupt group of threads by a single method call.
 * @author Deepansha Singh
 *
 */
public class ThreadGroup1 extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		ThreadGroup1 runnable = new ThreadGroup1();
		ThreadGroup family = new ThreadGroup("Parent ThreadGroup");
		
		Thread Deepansha = new Thread(family, runnable, "one");
		Deepansha.start();
		
		Thread Diyansha = new Thread(family, runnable, "two");
		Diyansha.start();
		
		Thread Papa = new Thread(family, runnable, "three");
		Papa.start();
		
		Thread Mamma = new Thread(family, runnable, "four");
		Mamma.start();
		
		System.out.println("Thread Group Name " + family.getName());
		family.list();
	}
}
