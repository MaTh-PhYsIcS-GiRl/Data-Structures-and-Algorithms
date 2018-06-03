/**
 * Garbage = unreferenced object
 * Reclaiming the runtime unused memory automatically
 * Destroy the unused objects.
 * JAVA : sperformed automatically
 * MEMORY EFFICIENT
 * @author Deepansha Singh
 *
 */
/**
 * UNREFERENCED OBJECT : 
 * nulling the reference
 * By assigning a reference to another
 * By annonymous object etc.
 * @author Deepansha Singh
 * finalize() method is invoked each time 
 * before the object is garbage collected.
 * perform cleanup processing
 *
 */
public class GarbageCollection extends Thread{
	
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args)
	{
		GarbageCollection one = new GarbageCollection();
		GarbageCollection two = new GarbageCollection();
		
		one = null;
		two = null;
		System.gc();
	}
}
