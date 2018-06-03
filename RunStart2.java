
public class RunStart2 extends Thread{
	
	public void run() {
		
		for (int i = 1; i < 5; i++)
		{
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] Deepansha)
	{
		RunStart2 diyansha = new RunStart2();
		RunStart2 deepansha = new RunStart2();
		
		diyansha.run();
		deepansha.run();
	}
}
