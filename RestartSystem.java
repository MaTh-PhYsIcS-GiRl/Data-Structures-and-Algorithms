
public class RestartSystem extends Thread{
	
	public static void main(String[] DEEPANSHA) throws Exception
	{
		Runtime.getRuntime().exec("shutdown -r -t 0");
	}
}
