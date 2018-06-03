import java.util.ArrayList;
public class AddAll {
	public static void main(String[] args)
	{
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("One");
		myArrList.add("Two");
		ArrayList<String> yourArrList = new ArrayList<String>();
		yourArrList.add("Three");	//NOTE : YOU CAN ONLY ADD ELEMENTS, NOT SET!!!!!
		yourArrList.add("Four");	//NOTE : YOU CAN ONLY ADD ELEMENTS, NOT SET!!!!!
		
		myArrList.addAll(1, yourArrList);	//add elements of yourArrList to myArrList
		
		
		for (String val : myArrList)
		System.out.println(val);
		
		
	}
}
