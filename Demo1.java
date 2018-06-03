/**
 * maps unique keys to values
 * KEY = OBJECT used to retreive a value at a later date
 * @author Deepansha Singh
 *
 */
import java.util.*;
public class Demo1 {
	public static void main(String[] DEEPANSHA)
	{
		Map m1 = new HashMap();
		m1.put("Deepansha", "15");
		m1.put("Diyansha", "10"); //object key, object value
		// null if the key did not already exist
		//.put() : overwriting any previous value associated with the key
		
		System.out.println("Map : " + m1);
	}
}
