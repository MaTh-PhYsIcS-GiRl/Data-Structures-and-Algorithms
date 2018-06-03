import java.util.*;
public class ConvertHashSettoArray {
	
	public static void main(String[] args)
	{
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");

		System.out.println("Hash Set contains " + hset);
		
		//create an array
		String[] array = new String[hset.size()];
		hset.toArray(array);
		
		//display
		System.out.println("Array Elements : ");
		
		for (String temp : array)
		{
			System.out.println(temp);
		}
	}
}
