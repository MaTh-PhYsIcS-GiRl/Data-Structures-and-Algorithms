/**
 * doesn’t maintain any order, the elements would be returned in any random order.
 * doesn’t allow duplicates, old value will be overwritten if trying to add a duplicate element
 * NON SYNCHRONIZED
 * Gives exception if hash set is changed after iterator
 */
import java.util.*;
public class HashSetExample {
	public static void main(String[] DEEPANSHA)
	{
		HashSet<String> hset = new HashSet<String>();
		
		//add elements
		hset.add("Deepansha");
		hset.add("is");
		hset.add("AWESOME!");
		
		//add duplicate elements
		hset.add("Deepansha");
		hset.add("AWESOME!");
		
		//add null values
		hset.add(null);
		hset.add(null);
		
		//display
		System.out.println(hset);
	}
}
