/**
 * method can call itself
 * compact, elegant code
 * easier to understand
 * recursion has a BASE CASE - conditional statement = first statement, return statement
 * address subproblems which don't overlap
 * @author Deepansha Singh
 *
 */

public class Example1 {
	
	public static int indexOf(int[] a, int key)
	{
		return indexOf(a, key, 0, a.length-1);
	}

	//recursive implementation of binary search 
	public static int indexOf(int[] a, int key, int lo, int hi)
	{
		if (lo > hi) 
			return -1;
		int mid = lo + (hi - lo) / 2;
		if  (key < a[mid])
			return indexOf(a, key, lo, mid-1);
		else if(key > a[mid])
			return indexOf(a, key, mid+1, hi);
		else 
			return mid;
	}
	
	
}
