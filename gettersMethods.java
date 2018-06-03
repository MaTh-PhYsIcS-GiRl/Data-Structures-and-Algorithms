
public class gettersMethods extends Thread {
	
	public void run()
	{
		System.out.println("running");
	}
	
	public static void main(String[] Deepansha)
	{
		gettersMethods one = new gettersMethods();
		gettersMethods two = new gettersMethods();
		System.out.println("Name of one : " + one.getName());
		System.out.println("Name of two : " + two.getName());
		
		//get id
		System.out.println("Name of one : " + one.getId());
		
		one.start();
		two.start();
		
		//set methods
		one.setName("Deepansha is AWESOME!");
		System.out.println("\nAfter changing name of one : " + one.getName());
	}
	
}
