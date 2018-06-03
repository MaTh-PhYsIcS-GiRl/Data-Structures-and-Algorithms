
public class NoReturnTypeConstructor {

	void NoReturnTypeConstructor()
	{
		System.out.println("I AM NO LONGER TREATED AS THE CONSTRUCTOR BECAUSE OF MY VOID"
				+ "RETURN TYPE");
	}
	
}
class Tester
{
	public static void main(String[] Deepansha)
	{
		NoReturnTypeConstructor one = new NoReturnTypeConstructor();	
		/**
		 * DOESN'T CALL METHOD NoReturnTypeConstructor with return type void, because
		 * constructors don't have return type
		 */
		one.NoReturnTypeConstructor();
	}
}
