/**
 * HashSet extends AbstractSet and implements the Set interface
 * creates a collection which uses a hash table for storage
 * HASHING : hashing, the informational content of a key is 
 * used to determine a unique value, called its hash code.
 * HASH CODE = INDEX
 * List can contain duplicate elements whereas Set contains unique elements only.
 * @author Deepansha Singh
 */
import java.util.*;
public class HashSetDemo {

   public static void main(String args[]) {
      // create a hash set
      HashSet hs = new HashSet();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println(hs);
   }
}