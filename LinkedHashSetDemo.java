import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;
public class LinkedHashSetDemo {
	int number;
	public LinkedHashSetDemo(int n)
	{
		number = n;
	}
	
	public String toString() {
		return number + " ";
	}
	
	public static void main(String[] args)
	{
		LinkedHashSet<LinkedHashSetDemo> dset = new LinkedHashSet<LinkedHashSetDemo>();
		
		dset.add(new LinkedHashSetDemo(2));
		dset.add(new LinkedHashSetDemo(1));
		dset.add(new LinkedHashSetDemo(3));
		dset.add(new LinkedHashSetDemo(5));
		dset.add(new LinkedHashSetDemo(4));
		
		Iterator<LinkedHashSetDemo> iterator = dset.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
		}

	}
}
