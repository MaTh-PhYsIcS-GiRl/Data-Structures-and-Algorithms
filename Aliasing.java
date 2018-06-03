
public class Aliasing {
	public static void main(String[] args)
	{
		int n = 10;
		int [] a = new int[n];
		int i = 8;
		a[i] = 1234;
		int[] b = a;
		b[i] = 5678;
		
		//aliasing : intent is to make a copy of the array
		//declare, create, and initialize a new array and then copy all entries in original array
		
	}
}
