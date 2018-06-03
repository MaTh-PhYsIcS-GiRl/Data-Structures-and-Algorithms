/**
 * same as HashMap instead maintains insertion order.
 * @author Deepansha Singh
 */
import java.util.*;
public class LinkedHashMap1 {
	
	public static void main(String[] DEEPANSHA)
	{
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(100,"HACK");
		hm.put(102, "WORLD");
		hm.put(101, "THE");
		
		//necessary for EntrySet() to traverse through whole array
		for (Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		/**
		 * DOES NOT MANTAIN ORDER!!!!!
		 */
	}
}
