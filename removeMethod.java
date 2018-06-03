/**
 * HASH SET VS. HASH MAP : 
 * HashSet contains only values whereas HashMap contains entry(key and value).
 */
import java.util.*;
public class removeMethod {
	public static void main(String[] DEEPANSHA)
	{
		//creates and populates a hash map
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Let us C");
		map.put(102, "Operating System");
		map.put(103, "HACKER!");
		
		System.out.println("BEFORE " + map);
		
		map.remove(102);
		System.out.println("AFTER " + map);
	}
}
