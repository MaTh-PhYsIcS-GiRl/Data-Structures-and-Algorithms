import java.util.HashMap;
import java.util.Map;
public class HashMapProgram {
	
	public static void main(String[] Deepansha)
	{
		System.out.println("Hashmap Program");
		
		HashMap<Integer, String> HMap = new HashMap<Integer, String>();
		
		HMap.put(1, "one");
		HMap.put(2, "two");
		HMap.put(3, "three");
		HMap.put(4, "four");
		HMap.put(5, "five");
		
		System.out.println(HMap.size());
		System.out.println(HMap.get(2));
		
		for(Map.Entry<Integer, String> entry : HMap.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
