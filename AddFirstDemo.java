import java.util.LinkedList;
public class AddFirstDemo {

	public static void main(String[] DEEPANSHA)
	{
		//create a linked list
				LinkedList ll = new LinkedList();
				
				//adds elements to the list
				ll.add("F");
			    ll.add("B");
			    ll.add("D");
			    ll.add("E");
			    ll.add("C");
			    ll.addLast("Z");
			    ll.addFirst("A"); //should be at index 0, but is overwritten by next .add()
			    ll.add(0, "A2");
			    System.out.println("Conents of ll: " + ll);
			    
	}
	
}
