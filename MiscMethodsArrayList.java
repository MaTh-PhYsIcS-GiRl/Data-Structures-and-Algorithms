import java.util.ArrayList;

/**
 * OBJECT ARE = IF THEY ARE REFERED TO BY THE SAME OBJECTS!
 * STRING CLASS IS THE EXCEPTION, BECAUSE OF THE POOL OF STRING OBJECTS
 * TO COMPARE OBJECTS BY THEIR VALUE, NEED TO OVERRIDE EQUALS() METHOD -- VALUES OF INSTANCE VARIABLE
 * @author Deepansha Singh
 *
 */
public class MiscMethodsArrayList {
	public static void main(String[] args)
	{
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Feb");
		
		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb2);
		
		System.out.println(myArrList.contains(new StringBuilder("Jan")));	//NEW : DIDN'T PREVIOUSLY EXIST
		System.out.println(myArrList.contains(sb1)); //TRUE OR FALSE
		System.out.println(myArrList.indexOf(new StringBuilder("Feb")));	//NEW : DIDN'T PREVIOUSLY EXIST
		System.out.println(myArrList.indexOf(sb2));
		System.out.println(myArrList.lastIndexOf(new StringBuilder("Feb")));	//NEW : DIDN'T PREVIOUSLY EXIST
		System.out.println(myArrList.lastIndexOf(sb2));

	}
}
