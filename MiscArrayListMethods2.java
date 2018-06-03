/**
 * IN ORDER FOR IT RETURN TRUE, NEED TO OVERRIDE EQUALS METHOD, 
 * BECAUSE IT IS ONLY = ACCORDING TO THE OTHER METHOD ONLY IF THEY BOTH HAVE
 * THE SAME VARIABLE ACCESSING IT
 * IT WON'T COMPARE THE OBJECT REFERENCE VARIABLES, IT WILL INSTEAD COMPARE STORED VALUES IN OBJECTS
 */
import java.util.ArrayList;
public class MiscArrayListMethods2 {
	public static void main(String[] Deepansha)
	{
		ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
		MyPerson p1 = new MyPerson("Shreya");
		MyPerson p2 = new MyPerson("Paul");
		myArrList.add(p1);
		myArrList.add(p2);
		myArrList.add(p2);

		
		System.out.println(myArrList.contains(new MyPerson("Shreya")));	//NEED TO OVERRIDE EQUALS METHOD
		System.out.println(myArrList.contains(p1));
		System.out.println(myArrList.indexOf(new MyPerson("Paul")));
		System.out.println(myArrList.indexOf(p2));
		System.out.println(myArrList.lastIndexOf(new MyPerson("Paul")));
		System.out.println(myArrList.lastIndexOf(p2));

	}
}
