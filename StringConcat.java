
public class StringConcat {
	
	public static void main(String[] ARGS)
	{
		int num = 10;
		int val = 12;
		String aStr = "OCJA";
		String anotherStr = num + val + aStr;
		System.out.println(anotherStr); //will add the 10 and the 12, int + int, then String concat
		
		anotherStr = "" + num + val + aStr;
		System.out.println(anotherStr);	//treats int variables as Strings, no int addition

		String lang = "Java";
		lang += " is everywhere!";
		String initializedToNull = null;
		initializedToNull += "Java";
		System.out.println(initializedToNull);	// be CERTAIN that variable wasn't previously NULL
	}
}
