
public class Join2 extends Thread{
	
	public void run()
	{
		for (int i = 1; i < 5; i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] Deepansha)
	{
		Join2 one = new Join2();
		Join2 two = new Join2();
		Join2 three = new Join2();
		
		one.start();
		try {
			one.join(1500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		two.start();
		three.start();
	}
}
