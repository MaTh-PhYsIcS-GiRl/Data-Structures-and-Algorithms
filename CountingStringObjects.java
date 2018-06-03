/**
 * String objects created from keword new : new string object is created, but never pooled
 * @author Deepansha Singh
 *
 */
public class CountingStringObjects {
	
	public static void main(String[] Deepansha)
	{
		String summer = new String("Summer"); //1 object with value Summer, NOT IN String constant pool
		String summer2 = "Summer"; //2nd object with value "Summer" and in String constant pool
		System.out.println("Summer");	//Doesn't create any new object, reuses from pool
		System.out.println("autumn"); //new String autumn in String constant pool
		System.out.println("autumn" == "summer");//reuses autumn from pool, new object summer in pool
		String autumn  = new String("Summer");	//creates a new string object with value Summer
		
		//Total number of objects : 5
		
	}
}
