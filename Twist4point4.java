import java.util.ArrayList;
public class Twist4point4 {
	public static void main(String[] args)
	{
		ArrayList<String> myArrList = new ArrayList<String>();
		
		String one = "One";
		String two = new String("Two");

		myArrList.add(one);
		myArrList.add(two);
		
		ArrayList<String> yourArrList = myArrList;
		one.replace("O", "B");

		//DOESN'T REPLACE TO BNE!!!!
		for (String val : myArrList)
			System.out.print(val + ":");
		
		System.out.println();
		
		for (String val1 : yourArrList)
			System.out.print(val1 + ":");
	}
}
