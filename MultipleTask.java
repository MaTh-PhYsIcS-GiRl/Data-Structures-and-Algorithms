
public class MultipleTask extends Thread{
	public void run()
	{
		System.out.println("task one");
	}
	public static void main(String[] Deepansha)
	{
		MultipleTask one = new MultipleTask();
		MultipleTask two = new MultipleTask();
		MultipleTask three = new MultipleTask();

		
		one.start();
		two.start();
		three.start();
	}
}
