import java.util.Enumeration;
import java.util.Hashtable;
public class Example2 {
	
	public static void main(String[] args)
	{
		//Creating the hashtable
		Hashtable ht = new Hashtable();
		
		//putting objects into the hashtable
		ht.put("David", 1000);	//key, value
		ht.put("John", 500);
		ht.put("Emma", 5000);
		ht.put("Rache", 2500);
		
		//Hashtable enumeration example : lists out all of the values in order
		Enumeration e = ht.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
		
		//how to find size of Hashtable in java
		System.out.println("Size of hashtable : " + ht.size());
		
		//does hashtable contain specified object as key
		System.out.println("Does table contain david as a key : " + 
							ht.containsKey("David"));
		
		//does hashtable contain specified object as a value
		System.out.println("Does hashtable contain 5000 as a value : " +
							ht.containsValue(5000));
	}

}
