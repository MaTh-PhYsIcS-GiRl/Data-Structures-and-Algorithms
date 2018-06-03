import java.util.*;
public class HashSet2 {
	public static void main(String[] args)
	{
		//creating a hash set and adding elements
		HashSet<String> set = new HashSet<String>();
		
		set.add("Deepansha");
		set.add("Diyansha");
		set.add("Mamma");
		set.add("Papa");
		
		//traversing elements
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
