import java.util.ArrayList;

public class DeleteElements {
	public static void main(String args[]) {
		ArrayList<StringBuilder> myArrList = new ArrayList<>();
		StringBuilder sb1 = new StringBuilder("One");
		StringBuilder sb2 = new StringBuilder("Two");
		StringBuilder sb3 = new StringBuilder("Three");
		StringBuilder sb4 = new StringBuilder("Four");
		
		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb3);
		myArrList.add(sb4);	
		myArrList.remove(1);
		
		for (StringBuilder element:myArrList)
			System.out.println(element);
		
		myArrList.remove(sb3);
		myArrList.remove(new StringBuilder("Four"));	//DOESN'T REMOVE FOUR!!!!
		//FAILS TO REMOVE, because object references are compared for equality using equals() method
		//equals() method is not overriden by StringBuilder, only = if their objects point to same object
		
		
		System.out.println();
		for (StringBuilder element : myArrList)
		System.out.println(element);
	}
}