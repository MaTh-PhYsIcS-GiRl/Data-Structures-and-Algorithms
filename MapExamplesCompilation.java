import java.util.Hashtable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
public class MapExamplesCompilation {
	
	public static void main(String[] Deepansha)
	{
		/**
		 * Example 1
		 */
		Hashtable<Integer, String> source = new Hashtable<Integer, String>();
		//create a HashMap by copying data from another map or hashtable
		HashMap<Integer, String> map = new HashMap(source);
		
		map.put(21, "Twenty One"); 
		//map.put(21.0, "Twenty One"); throw compiler error because 21.0 is not an integer
		
		
		/**
		 * Example 2 : Retrieving Values
		 */
		Integer key = 21;
		String value = map.get(key); //Integer is a class, int is a primitive data type
		//Integer wraps primitive value int in an object
		System.out.println("Key : " + key + " Value: " + value);
		
		/**
		 * Example 3 : Iterating over a hash map
		 * loop through the whole map and perform operations on each key-value pair
		 */
		
		map.put(21, "Twenty One");
		map.put(31, "Thirty One");
		
		Iterator<Integer> keySetIterator = map.keySet().iterator();
		System.out.println();
		while(keySetIterator.hasNext())
		{ 
			Integer key1 = keySetIterator.next();
			System.out.println("key: " + key + " value: " + map.get(key1)); 
		} 
		
		/**
		 * Example 4 : Size and Clear in Hash Map
		 * reuse Map by clearing it, 
		 * but be careful if it's been shared between multiple threads 
		 * without proper synchronization
		 */
		System.out.println("\nSize of Map : " + map.size());
//		map.clear();
//		System.out.println("Size of Map : " + map.size());
		
		
		/**
		 * Examples 5 & 6 : ContainsKey and ContainsValue examples
		 */
		System.out.println();
		System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21)); //PRINTS TRUE
		System.out.println("Does HashMap contains 21 as value: " + map.containsValue(21)); //PRINTS FALSE
		System.out.println("Does HashMap contains Twenty One as value: " + map.containsValue("Twenty One")); //PRINTS TRUE
		
		/**
		 * Example 7 : Checking if HashMap is empty
		 */
		
		boolean isEmpty = map.isEmpty();
		System.out.println("\nIs HashMap empty? : " + isEmpty);
		
		/**
		 * Example 8 : Removing Objects from HashMap
		 * removing mapping from a specefic key
		 */
		
		Integer key3 = 21;
		Object value1 = map.remove(key3);
		System.out.println("\nFollowing value is removed from Map : " + value1);
		
		/**
		 * Sorting Hash Maps in java
		 */
		map.put(21, "Twenty One"); 
		map.put(31, "Thirty One");
		map.put(41, "Thirty One");
		
		System.out.println("\nUnsorted HashMap: " + map); 
		
		TreeMap sortedHashMap = new TreeMap(map);
		System.out.println("Sorted HashMap: " + sortedHashMap); 


	}
}
