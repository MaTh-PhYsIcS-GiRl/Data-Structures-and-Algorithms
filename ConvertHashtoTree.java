import java.util.*;
public class ConvertHashtoTree {
	public static void main(String[] DEEPANSHA)
	{
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");

		//display hash elements
		System.out.println("Hash Set contains " + hset);
		
		//create a tree set of hash set elements
		Set<String> tset = new TreeSet<String>(hset);
		
		//displaying tree elements
		System.out.println("TreeSet contains : ");
		for(String temp : tset)
		{
			System.out.println(temp);
		}
	}
}
