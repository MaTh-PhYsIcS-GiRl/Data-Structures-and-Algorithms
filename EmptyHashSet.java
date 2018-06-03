import java.util.*;
public class EmptyHashSet {
	public static void main(String[] args)
	{
		HashSet<String> hset = new HashSet<String>();
		
		//add elements
		hset.add("Element 1");
		hset.add("Element 2");
		hset.add("Element 3");
		hset.add("Element 4");
		hset.add("Element 5");
		
		
		System.out.println("Before : " + hset);
		
		hset.clear();
		
		System.out.println("After : " + hset);
	}
}
