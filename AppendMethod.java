/**
 * String Builder Method
 * add data of any type
 * NOTE : THIS METHOD HAS BEEN OVERLOADED SO IT CAN ACCEPT ANY DATA TYPE!!!!
 * @author Deepansha Singh
 *
 */
public class AppendMethod {
	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder();
		sb1.append(true);
		sb1.append(10);
		sb1.append('a');
		sb1.append(20.99);
		sb1.append("Hi");
		
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder();
		
		//append an entire array
		char[] name = {'J', 'a', 'v', 'a'};
		sb2.append(name, 1, 3);
		
		System.out.println(sb2);
	}
}
