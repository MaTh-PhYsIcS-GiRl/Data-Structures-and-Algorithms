/**
 * For insert method, you can insert data at any particular position
 * append is only for end of StringBuilder object
 * @author Deepansha Singh
 *
 */
public class InsertStringBuilder {
	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("Bon");
		sb1.insert(2, 'r');
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("123");
		char[] name = {'J', 'a', 'v', 'a'};
		sb2.insert(1, name, 1, 3);	//at pos 1, store pos 1-3 of Java = at pos 1, store ava
		
	}
}
