
public class TestTwist3point1 {
	
	public static void main(String DEEPANSHA[])
	{
		Twist3point1 one = new Twist3point1();
		one.setNumber();
		System.out.println(one.phoneNumber);
		/**
		 * will print out 123456789 because phoneNumber is the instance variable, which has more scope than the local variable
		 * doesn't have to be a class variable, works also with an instance variable
		 */
	}		
}
