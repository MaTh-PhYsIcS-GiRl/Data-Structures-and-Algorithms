import java.util.*;
public class ConvertHashSettoArrayList {
	public static void main(String[] args)
	{
		HashSet<String> hset = new HashSet<String>();
		
		//add elements
		hset.add("Deepansha");
		hset.add("AWESOMENESS");
		hset.add("coolio");
		hset.add("C'MON!");
		hset.add("YESSSS!");
		
		//display elements
		System.out.println("Hash Set contains : " + hset);
		
		//List of hashset elements
		List<String> list = new ArrayList<String>(hset);
		System.out.println("Array List  : " + list);
	}
}
