/**
 * PROBLEM : PRINTING MEMORY ADDRESSES
 * Objective :  Order is not certain
 */
import java.util.*;
public class HashSetExample2 {
	
	private int number;
	public HashSetExample2(int n)
	{
		number = n;
	}
	
	public static void main(String[] ARGS)
	{
		HashSet<HashSetExample2> dset = new HashSet<HashSetExample2>();
		dset.add(new HashSetExample2(2));
		dset.add(new HashSetExample2(1));
		dset.add(new HashSetExample2(3));
		dset.add(new HashSetExample2(5));
		dset.add(new HashSetExample2(4));
		
		
		Iterator<HashSetExample2> iterator = dset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\n");
	}

	}
}
