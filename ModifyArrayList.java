import java.util.ArrayList;
public class ModifyArrayList {
	public static void main(String[] args)
	{
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("One");
		myArrList.add("Two");
		myArrList.add("Three");
		myArrList.set(1, "One and a Half");	//set completely removes the previous element,
		//it doesn't  add on
		for (String element : myArrList)
			System.out.println(element);
	}
}
