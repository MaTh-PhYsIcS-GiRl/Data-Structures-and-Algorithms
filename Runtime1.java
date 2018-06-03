/**
 * interact with the JRE
 * only one instance available for one Java application from JRE
 * @author Deepansha Singh
 *
 */
public class Runtime1{
	
	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("notepad"); //will open a new notepad
	}
}
