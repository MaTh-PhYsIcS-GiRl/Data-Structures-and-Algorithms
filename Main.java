import java.util.Hashtable;
public class Main {
	
	public static void main(String[] Deepansha)
	{
		Hashtable<String, String> employees = new Hashtable<String, String>();
		
		employees.put("one", "Deepansha");
		employees.put("one", "Diyansha");
		employees.put("five", "Mamma");
		employees.put("three", "Papa");
		employees.put("one and a half", "Bobby");

		
		for (String itm : employees.keySet())
		{
			System.out.println(itm + " " + employees.get(itm));
		}
		
	}
}
