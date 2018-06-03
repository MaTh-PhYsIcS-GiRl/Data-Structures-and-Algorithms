/**
 * elements are sorted
 */
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet ts5 = new TreeSet();
		
		ts5.add("Deepansha");
		ts5.add("COOL");
		ts5.add("AMAZING");
		
		System.out.println(ts5.first());
		System.out.println(ts5.last());
		
		//prints elements less than D	
		System.out.println(ts5.headSet("D"));
		System.out.println(ts5.headSet("C"));
		System.out.println(ts5.headSet("A"));
		
		//elements greater than or equal to G
		System.out.println("\n" + ts5.tailSet("D"));
		System.out.println(ts5.tailSet("C"));
		System.out.println(ts5.tailSet("A"));
		
		System.out.println("\n" + ts5.subSet("A", "D"));
		//System.out.println("\n" + ts5.subSet("D", "A"));
		
		ts5.clear();
		
		System.out.println(ts5);


	}
	
}
