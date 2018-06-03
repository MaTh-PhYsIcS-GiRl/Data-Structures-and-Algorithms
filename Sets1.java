/**
 * Set is a Collection that cannot contain duplicate elements
 * Methods inherited from Collection
 * @author Deepansha Singh
 *
 */
import java.util.*;
public class Sets1 {
	public static void main(String[] args)
	{
		int[] count = {124,14,345, 123,14,152};
		Set<Integer> set  = new HashSet<Integer>();
		
		try {
			for (int i = 0; i < 6; i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is : ");
			System.out.println(sortedSet);
			
			System.out.println("The first element of the set is " + (Integer)sortedSet.first());
			System.out.println("The last element of the set is " + (Integer)sortedSet.last());

		}
		catch(Exception e) {}
	}
}
