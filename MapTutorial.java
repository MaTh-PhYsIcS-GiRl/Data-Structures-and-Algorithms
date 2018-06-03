import java.util.*;
public class MapTutorial {
	
	public static void main(String[] Deepansha)
	{
		//create a hash map
		HashMap<String, Double> myMap = new HashMap<String, Double>();
		
		//populate hash map
		myMap.put("a", new Double(10.2));
		myMap.put("b", new Double(0.78));
		myMap.put("c", new Double(20.5));
		
		//showing keys
		for(String str : myMap.keySet())
		{
			System.out.println(str);
		}
		
		//showing keys
				for(Double dbl : myMap.values())
				{
					System.out.println(dbl);
				}
		
		
	}
}

