/**
 * toArray : converts from arraylist to an array
 */
import java.util.ArrayList;
public class CloningArrayList {
	public static void main(String[] args)
	{
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Jan");

		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb2);
		
		ArrayList<StringBuilder> assignedArrList = myArrList; // = REFER TO SAME OBJECT
		ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>) myArrList.clone();
		//CLONE : ASSIGNS A COPY: refer to DIFFERENT objects
		
		System.out.println(myArrList == assignedArrList);//refer to SAME OBJECT
		System.out.println(myArrList == clonedArrList);	//refer to DIFFERENT OBJECTS
		
		StringBuilder myArrVal = myArrList.get(0);
		StringBuilder assignedArrVal = assignedArrList.get(0);
		StringBuilder clonedArrVal = clonedArrList.get(0); //proves that the method clone didn't copy
		//the elements 
		
		System.out.println(myArrVal == assignedArrVal); //TRUE
		System.out.println(myArrVal == clonedArrVal);	//TRUE : INDIVUDAL ELEMENTS OF CLONED = ORIGINAL
		
	}
}
