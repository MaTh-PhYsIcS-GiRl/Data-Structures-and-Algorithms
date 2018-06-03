/**
 * store same sequence of characters but refer to separate objects at separate locations
 * @author Deepansha Singh
 *
 */
public class StringEquality {
	public static void main(String[] args)
	{
		String str1 = new String("Deepansha");
		String str2 = new String("Deepansha");
		System.out.println(str1 == str2);
		//prints false because at separate locations
		
		
		/**
		 * NOW, objects are created and stored in a pool of String objects
		 * if the same sequence of characters is present already in the pool, Java will
		 * not create a new space, but instead, equate them
		 */
		String str3 = "Deepansha";
		String str4 = "Deepansha";
		System.out.println(str3 == str4);
		
		
		
	}
}
