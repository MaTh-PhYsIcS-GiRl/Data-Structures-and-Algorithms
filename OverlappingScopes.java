
public class OverlappingScopes {
	/**
	 * CLASS VARIABLE AND INSTANCE VARIABLE CAN'T HAVE SAME NAME : WON'T COMPILE	
	 */
	//	static boolean one = true;
	//	boolean one = true;
	
	
	/**
	 * WILL COEXIST/COMPILE, because of different scopes of local variable, class variable, and instance variable
	 */
	static boolean softKeyboard = true;
	String phoneNumber;
	void myMethod() 
	{
		
		boolean softKeyboard = true;
		String phoneNumber;
	}
	
	
	}
