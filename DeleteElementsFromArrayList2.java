import java.util.ArrayList;
public class DeleteElementsFromArrayList2 {
	public static void main(String[] args)
	{
		ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
		MyPerson p1 = new MyPerson("Shreya");
		MyPerson p2 = new MyPerson("Paul");
		MyPerson p3 = new MyPerson("Harry");
		
		myArrList.add(p1);
		myArrList.add(p2);
		myArrList.add(p3);
		myArrList.remove(new MyPerson("Paul"));
		
		for (MyPerson element:myArrList)
			System.out.println(element.name);
	}
}
