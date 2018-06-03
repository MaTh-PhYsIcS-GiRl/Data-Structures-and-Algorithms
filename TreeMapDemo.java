/**
 * HASH MAP : can only contain one null key, tree map can't contain any null key
 * HASH MAP : no order, tree map : ascending order
 * tree map : no null key, Hash map : can contain one null key
 */
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args)
	{
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		
		hm.put(100,"HACK");
		hm.put(102, "THE");
		hm.put(101, "WORLD");
		
		//necessary for EntrySet() to traverse through whole array
		for (Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		/**
		 * MANTAINS ORDER, UNLIKE HASH MAP!!!!!!!
		 */
	}
}
