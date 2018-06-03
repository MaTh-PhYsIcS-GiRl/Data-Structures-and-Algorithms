/**
 * implements the Map class by using a hashtable
 * inherits AbstractMap class
 * NO ORDER
 * VALUES BASED ON THE KEY
 * ONLY UNIQUE ELEMENTS
 */
import java.util.*;
public class IteratorExample1 {
	public static void main(String[] DEEPANSHA)
	{
		Map map = new HashMap();
		
		//adding elements to the map
		map.put(1, "Deepansha");
		map.put(2, "Diyansha");
		map.put(3, "MOANA");
		
		//traversing map
		Set set = map.entrySet();//NEED TO CONVERT MAP TO SET : SET VIEW OF THE MAPPINGS
		Iterator iterator = set.iterator();
		while (iterator.hasNext())
		{
			Map.Entry entry = (Map.Entry)iterator.next();	//converting to Map
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
