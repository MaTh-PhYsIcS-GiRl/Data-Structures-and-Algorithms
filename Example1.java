/**
 * void clear : remove all key mappings of hashtable and makes it empty
 * Object clone() : creates shallow copy of hashtable -- only structure is copied, not keys and values
 * boolean isEmpty() : tests if hashtable maps no keys to values
 * Enumeration key() : 	enumeration of keys contained in hash table
 * Object put (Object key, Object value) : maps specified key to specified value in hashtable
 * void rehash() : increases size of hash table and rehashes all of its keys
 * Object remove(Object key) : removes key and its corresponding value from table
 * int size() : returns number of key - value mappings in hashtable
 * toString() : string equivalent to hash table
 * boolean containsKey(Object key) : tests if key is in table
 * 
 */

/**
 * Hash map vs. Hash table : 
 * Hash map : non synchronized : more than one thread can access the Hash Map simultaneously
 * Hash table : synchronized : no more than one thread can access the table simultaneously
 * 
 * Hash map : allows null keys, hash table doesn't allow null keys
 * 
 * Hashtable : doesn't mantain mappings in any order unlike hash map
 * 
 * Hash map has been a part of the collection framework since very beginning
 * 
 */
import java.util.Hashtable;
import java.util.Enumeration;

public class Example1 {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Key1","Chaitanya");
   hashtable.put("Key2","Ajeet");
   hashtable.put("Key3","Peter");
   hashtable.put("Key4","Ricky");
   hashtable.put("Key5","Mona");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}