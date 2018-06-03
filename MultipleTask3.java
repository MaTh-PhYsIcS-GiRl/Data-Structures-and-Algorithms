class Simple1 extends Thread
{
	public void run() {
		System.out.println("task one");
	}
}
class Simple2 extends Thread
{
	public void run()
	{
		System.out.println("task two");
	}
}
public class MultipleTask3{
		
	public static void main(String[] args)
	{
		Simple1 one = new Simple1();
		Simple2 two = new Simple2();
		
		one.start();
		two.start();

	}
	
}
