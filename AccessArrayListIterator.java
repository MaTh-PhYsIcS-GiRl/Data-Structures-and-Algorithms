/**
 * List Iterator doesn't contain reference to CURRENT element
 * Iterator makes it possible to remove elements, but enhanced for each loop doesn't
 */
import java.util.ArrayList;
import java.util.ListIterator;
public class AccessArrayListIterator {
	public static void main(String[] args)
	{
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Four");
		myArrayList.add(2, "Three");
		
		ListIterator<String> iterator = myArrayList.listIterator();
		while (iterator.hasNext())	//hasNext checks whether the next element exists : boolean value
			//hasNext : true or false
			System.out.println(iterator.next());	//get next element

	}
}
