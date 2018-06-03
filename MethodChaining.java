/**
 * From left to right
 * @author Deepansha Singh
 *
 */
public class MethodChaining {
	
	public static void main(String[] Deepansha)
	{
		String result = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
		//.CONCAT adds on
		System.out.println(result);
		
		
		//MAKE SURE TO RE-EQUATE DAY AFTER METHOD CHAINING!
		//Strings are immutable so they won't just change by invoking methods on them, 
		//need to "reassign" them
		String day = "SunDday";
		day.replace('D', 'Z').substring(3);
		System.out.println(day);
		day = day.replace('D', 'Z').substring(3);
		System.out.println(day);
		
//		String letters1 = "ABCAB";
//		System.out.println(letters1.substring(0, 2).startsWith('A'));
		//CONCEPT : needs to be "A" to compile not 'A'
	}
}
