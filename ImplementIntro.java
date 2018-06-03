/**
 * implement runnable interface
 * @author Deepansha Singh
 *
 */
import java.lang.Thread;
public class ImplementIntro implements Runnable{
	public void run() {
		System.out.println("thread is running");
	}
	
	public static void main(String[] Deepansha) {
		
		ImplementIntro one = new ImplementIntro();
		Thread t1 = new Thread(one);
		t1.start(); 
		
	}
		
}
