/**
 * Initializer Block : used to initialize variables of anonymous classes
 * Anonymous class : type of inner class
 * @author Deepansha Singh
 *
 */
/**
 * Java only defines a default constructor, if the user didn't define one
 * @author Deepansha Singh
 *
 */
public class MultipleInitializersConstructor {
	
	{
		System.out.println("HI-1");
	}
	
	public MultipleInitializersConstructor() {
		System.out.println("HI-CONSTRUCTOR");
	}
	
	{
		System.out.println("HI-2");
	}
	
	public static void main(String[] args)
	{
		MultipleInitializersConstructor one = new MultipleInitializersConstructor();
		//both initializers will print out before constructor, even tho constructor is initialized before
	}
}
