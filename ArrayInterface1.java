/**
 * type of an array is an interface
 * 
 * @author Deepansha Singh
 *
 */
public interface ArrayInterface1 {
	class ArrayClass1 implements ArrayInterface1{}
	class ArrayClass2 implements ArrayInterface1{}
	class Test
	{
		ArrayInterface1[] interfaceArray = new ArrayInterface1[]
				{
						new ArrayClass1(),
						null,
						new ArrayClass2()
				};
	}
}
