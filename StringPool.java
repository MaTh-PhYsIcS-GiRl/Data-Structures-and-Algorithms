
public class StringPool {
	public static void main(String[] Deepansha)
	{
		String morning1 = "Morning";
		System.out.println("Morning" == morning1);
		//this uses a String pool
		
		String morning2 = new String("Morning");
		System.out.println("Morning" == morning2);
		//this doesn't use a string pool
	}
}
