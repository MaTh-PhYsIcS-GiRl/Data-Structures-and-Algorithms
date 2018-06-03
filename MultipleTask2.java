
public class MultipleTask2 extends Thread{
	public void run()
	{
		System.out.println("task one");
	}
	public static void main(String[] Deepansha)
	{
		Thread one = new Thread(new MultipleTask2());//passing annonymous object of TestMultitasking2 class  
		Thread two = new Thread(new MultipleTask2());
		
		one.start();
		two.start();
	}
}	
