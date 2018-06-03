/**
 * To access elements
 * Use get() method, enhanced for loop, Iterator, or ListIterator
 */
import java.util.ArrayList;
public class AccessArrayList {
	public static void main(String[] args)
	{
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Four");
		myArrayList.add(2, "Three");

		for (String element : myArrayList)
			System.out.println(element);
	}
}
